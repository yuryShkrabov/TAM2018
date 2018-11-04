package object_model.sevice;

import object_model.TaxoPark;
import object_model.Vehicle;
import object_model.exceptions.ConditionsNotMeetExpectationsException;
import object_model.exceptions.OutOfRangeException;
import org.apache.commons.lang3.Range;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TaxoParkManager extends TaxoPark {

    private List<Vehicle> listOfVehiclesByPriceRange;

    public int getTaxoparkCost(TaxoPark taxoPark) {
        return Objects.nonNull(taxoPark.getListOfVehicles()) ? taxoPark.getListOfVehicles().stream().mapToInt(x -> x.getPrice()).sum() : 0;
    }

    public void printTaxoParkCost(TaxoPark taxoPark) {
        TaxoParkManager taxoParkManager = new TaxoParkManager();
        System.out.println("\n[Cost of TaxoPark:] " + taxoParkManager.getTaxoparkCost(taxoPark) + "$");
    }

    public void sortByFuelConsumption(TaxoPark taxoPark) {
        taxoPark.getListOfVehicles().sort(Comparator.comparing(Vehicle::getFuelConsumption));
    }

    public void printTaxoParkInfo(TaxoPark taxoPark) {
        taxoPark.getListOfVehicles().stream().forEach(x -> x.printVehicleInfo());
    }

    public List<Vehicle> getVehicleByPriceRange(TaxoPark taxoPark, int startPrice, int endPrice) {
        try {
            if (startPrice <= endPrice) {
                listOfVehiclesByPriceRange = taxoPark.getListOfVehicles().stream()
                        .filter(x -> Range.between(startPrice, endPrice).contains(x.getPrice())).collect(Collectors.toList());
            } else {
                throw new OutOfRangeException("Start price cannot be greater than End price.");
            }
        } catch (OutOfRangeException e) {
            System.out.println("\n" + e.getMessage());
        }
        System.out.println("[Vehicles requested by price range:]");
        return listOfVehiclesByPriceRange;
    }

    public void printVehicleByPriceRange(List<Vehicle> listOfVehiclesByPriceRange) {
        try {
            if (listOfVehiclesByPriceRange.size() != 0) {
                listOfVehiclesByPriceRange.stream().forEach(Vehicle::printVehicleInfo);
            } else {
                System.out.println("No vehicles found in requested price range.");
            }
        } catch (NullPointerException e) {
            System.out.println("Nothing to print.");
        }
    }

    public void deleteVehicleFromTaxoPark(TaxoPark taxoPark, Vehicle vehicle) {
        if (taxoPark.getListOfVehicles().remove(vehicle) == false) {
            try {
                throw new ConditionsNotMeetExpectationsException("Vehicle can not be deleted. Taxopark does not contain the specified object.");
            } catch (ConditionsNotMeetExpectationsException e) {
                e.printStackTrace();
            }
        }
    }
}
