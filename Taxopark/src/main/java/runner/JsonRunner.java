package runner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import object_model.PassengerCar;
import object_model.Usage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static constants.FilesConstants.PATH_TO_JSON;

public class JsonRunner {

    public static void main(String[] args) {

        PassengerCar carToWtiteToJson = new PassengerCar(
                250,
                 Usage.TAXI,
                "carToWriteToJsonFile",
                6,
                6.3,
                2018,
                157);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("[Car object to write to json:]");
        carToWtiteToJson.printVehicleInfo();

        /**
         * WRITE TO JSON FILE
         */
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_TO_JSON);
        } catch (IOException e) {
            e.printStackTrace();
        }
        gson.toJson(carToWtiteToJson, fileWriter);

        /**
         * CLOSE FILE WRITER
         */
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * READ FROM JSON FILE
         */
        JsonReader jsonReader = null;
        try {
            jsonReader = new JsonReader(new FileReader(PATH_TO_JSON));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PassengerCar carThatRedFromJson = gson.fromJson(jsonReader, PassengerCar.class);
        System.out.println("\n[Car object that red from json:]");
        carThatRedFromJson.printVehicleInfo();
    }
}
