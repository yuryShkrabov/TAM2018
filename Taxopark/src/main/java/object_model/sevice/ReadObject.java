package object_model.sevice;

import object_model.Vehicle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    private FileInputStream fileInputStream;
    private ObjectInputStream objectInputStream;

    public Vehicle readObjectFromFile(String filePath) {
        Vehicle vehicle = new Vehicle() {
            @Override
            public void printVehicleInfo() {

            }
        };
        try {
            fileInputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            objectInputStream = new ObjectInputStream(fileInputStream);
            try {
                vehicle = (Vehicle) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vehicle;
    }
}
