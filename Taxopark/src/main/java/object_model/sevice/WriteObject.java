package object_model.sevice;

import object_model.Vehicle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    private FileOutputStream fileOutputStream;
    private ObjectOutputStream objectOutputStream;

    public void writeVehicleToTextFile(Vehicle vehicle, String filePath) {
        try {
            fileOutputStream = new FileOutputStream(filePath);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(vehicle);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
