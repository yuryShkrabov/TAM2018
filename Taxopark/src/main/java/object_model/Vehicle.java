package object_model;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {

    private int vehicleId;
    private String makeOfCar;
    private double fuelConsumption;
    private int yearOfManufacture;
    private int price;

    public Vehicle(int vehicleId, String makeOfCar, double fuelConsumption, int yearOfManufacture, int price) {
        this.vehicleId = vehicleId;
        this.makeOfCar = makeOfCar;
        this.fuelConsumption = fuelConsumption;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
    }

    public Vehicle() {
    }

    public abstract void printVehicleInfo();

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeOfCar() {
        return makeOfCar;
    }

    public void setMakeOfCar(String makeOfCar) {
        this.makeOfCar = makeOfCar;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
