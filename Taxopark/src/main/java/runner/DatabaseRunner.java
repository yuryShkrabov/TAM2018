package runner;

import object_model.PassengerCar;
import object_model.sevice.DatabaseReader;

import java.util.List;

public class DatabaseRunner {

    public static void main(String[] args) {

        List<PassengerCar> carsFromDatabase;
        DatabaseReader databaseReader = new DatabaseReader();

        /**
         * READ FROM DATABASE
         */
        carsFromDatabase = databaseReader.getPassengerCarsFromDatabase();
        System.out.println("\n[Object retrieved from database:]");
        carsFromDatabase.stream().forEach(x -> x.printVehicleInfo());
    }
}
