package object_model;

import java.io.Serializable;

import static object_model.Usage.RENT;
import static object_model.Usage.TAXI;

public class Truck extends Vehicle implements Serializable {

    private double loadCapacity;
    private Usage usageType;

    public Truck(int vehicleId, Usage usageType, String makeOfCar, double loadCapacity, double fuelConsumption, int yearOfManufacture, int price) {
        super(vehicleId, makeOfCar, fuelConsumption, yearOfManufacture, price);
        this.loadCapacity = loadCapacity;
        this.usageType = usageType;
    }

    public Truck() {
    }

    @Override
    public void printVehicleInfo() {
        System.out.println("id:" + getVehicleId() + ", available for: " + getUsageType() + ", make: " + getMakeOfCar() + ", load capacity: " + getLoadCapacity()
                + " tons, fuel consumption: " + getFuelConsumption() + " litres, year: " + getYearOfManufacture() + ", price: " + getPrice() + "$;");
    }

    @Override
    public String toString() {

        return "[id]: " + getVehicleId() + " [usage]: " + usageType + " [make]: " + getMakeOfCar() + " [load capacity]: " + loadCapacity +
                " [fuel consumption]: " + getFuelConsumption() + " [year]: " + getYearOfManufacture() + " [price]: " + getPrice() + "\n";
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
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
            this.usageType = null;
        }
    }
}
