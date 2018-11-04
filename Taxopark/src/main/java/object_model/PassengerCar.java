package object_model;

import java.io.Serializable;
import static object_model.Usage.RENT;
import static object_model.Usage.TAXI;

public class PassengerCar extends Vehicle implements Serializable {

    private Usage usageType;
    private int passengerCapacity;

    public PassengerCar(int vehicleId, Usage usageType, String makeOfCar, int passengerCapacity, double fuelConsumption, int yearOfManufacture, int price) {
        super(vehicleId, makeOfCar, fuelConsumption, yearOfManufacture, price);
        this.usageType = usageType;
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerCar() {
    }

    @Override
    public void printVehicleInfo() {
        System.out.println("id:" + getVehicleId() + ", available for: " + getUsageType() + ", make: " + getMakeOfCar() + ", passengers: " + getPassengerCapacity()
                + ", fuel consumption: " + getFuelConsumption() + " litres, year: " + getYearOfManufacture() + ", price: " + getPrice() + "$;");
    }

    @Override
    public String toString() {

        return "[id]: " + getVehicleId() + " [usage]: " + usageType + " [make]: " + getMakeOfCar() + " [passengers]: " + passengerCapacity +
                " [fuel consumption]: " + getFuelConsumption() + " [year]: " + getYearOfManufacture() + " [price]: " + getPrice() + "\n";
    }

    public Usage getUsageType() {
        return usageType;
    }

    public void setUsageType(Usage usageType) {
        this.usageType = usageType;
    }

    public void setUsageType(String usageType) {
        if (usageType.equalsIgnoreCase("taxi")) {
            this.usageType = TAXI;
        } else if (usageType.equalsIgnoreCase("rent")) {
            this.usageType = RENT;
        } else {
            System.out.println("Usage type not applicable.");
            this.usageType = null;
        }
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
