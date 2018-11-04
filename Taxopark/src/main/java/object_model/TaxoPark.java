package object_model;

import java.util.ArrayList;
import java.util.List;

public class TaxoPark {

    private List<Vehicle> listOfVehicles = new ArrayList<>();

    public TaxoPark() {
        listOfVehicles.add(new PassengerCar(1, Usage.RENT, "Mercedes", 2, 12.5, 2014, 19250));
        listOfVehicles.add(new Truck(2, Usage.TAXI, "Reno", 3.5, 18.1, 2008, 14700));
        listOfVehicles.add(new PassengerCar(3, Usage.TAXI, "VolksWagen", 4, 8.3, 2011, 6150));
        listOfVehicles.add(new Truck(4, Usage.RENT, "Mitsubishi", 4.2, 14.7, 2016, 19820));
        listOfVehicles.add(new PassengerCar(5, Usage.RENT, "Peugeot", 2, 7.1, 2014, 3650));
        listOfVehicles.add(new Truck(6, Usage.TAXI, "Zil", 5.7, 20.3, 1992, 5720));
        listOfVehicles.add(new PassengerCar(7, Usage.TAXI, "Audi", 4, 12.3, 2018, 35605));
        listOfVehicles.add(new Truck(8, Usage.TAXI, "Gazel", 3.7, 14.6, 2001, 4250));
        listOfVehicles.add(new PassengerCar(9, Usage.RENT, "Lexus", 2, 17.1, 2017, 32890));
        listOfVehicles.add(new Truck(10, Usage.TAXI, "Catepillar", 7.5, 22.3, 2003, 19300));
        listOfVehicles.add(new PassengerCar(11, Usage.TAXI, "Volvo", 4, 6.2, 2007, 5010));
        listOfVehicles.add(new Truck(12, Usage.RENT, "Volkswagen", 4.8, 18.2, 2014, 18860));
    }

    public List<Vehicle> getListOfVehicles() {
        return listOfVehicles;
    }
}
