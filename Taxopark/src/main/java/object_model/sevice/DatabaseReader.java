package object_model.sevice;

import database.DatabaseConnector;
import object_model.PassengerCar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static constants.DatabaseConstants.SELECT_ALL_QUERY;

public class DatabaseReader {

    Connection connection = DatabaseConnector.getConnection();
    Statement statement;

    {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    ResultSet resultSet;

    {
        try {
            resultSet = statement.executeQuery(SELECT_ALL_QUERY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<PassengerCar> getPassengerCarsFromDatabase() {
        List<PassengerCar> listOfCars = new ArrayList<PassengerCar>();
        PassengerCar passengerCar;
        int i = 0;
        try {
            while (resultSet.next()) {
                passengerCar = new PassengerCar();
                passengerCar.setVehicleId(resultSet.getInt("vehicle_id"));
                passengerCar.setUsageType(resultSet.getString("usage"));
                passengerCar.setMakeOfCar(resultSet.getString("make"));
                passengerCar.setPassengerCapacity((int) resultSet.getDouble("capacity"));
                passengerCar.setFuelConsumption(resultSet.getDouble("fuelConsumption"));
                passengerCar.setYearOfManufacture(resultSet.getInt("year"));
                passengerCar.setPrice(resultSet.getInt("price"));
                listOfCars.add(i, passengerCar);
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfCars;
    }
}
