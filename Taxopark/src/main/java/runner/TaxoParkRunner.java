package runner;

import object_model.*;
import object_model.sevice.InputManager;
import object_model.sevice.TaxoParkManager;

public class TaxoParkRunner {

    public static void main(String[] args) {

        TaxoPark taxoPark = new TaxoPark();
        TaxoPark taxoParkSortedByFuelConsumption = new TaxoPark();
        TaxoParkManager taxoparkManager = new TaxoParkManager();
        int startPrice;
        int endPrice;

        /**
         * Prints initial TaxoPark
         */
        System.out.println("[Initial TaxoPark:]");
        taxoparkManager.printTaxoParkInfo(taxoPark);
        taxoparkManager.printTaxoParkCost(taxoPark);

        /**
         * Sorts initial TaxoPark by fuel consumption
         */
        taxoparkManager.sortByFuelConsumption(taxoParkSortedByFuelConsumption);
        System.out.println("\n[TaxoPark sorted by fuel consumption(desc):]");
        taxoparkManager.printTaxoParkInfo(taxoParkSortedByFuelConsumption);

        /**
         * Prints vehicles by requested price range
         */
        System.out.println("\nEnter start price:");
        startPrice = InputManager.enterPrice();
        System.out.println("Enter end price:");
        endPrice = InputManager.enterPrice();
        taxoparkManager.printVehicleByPriceRange(taxoparkManager.getVehicleByPriceRange(taxoPark, startPrice, endPrice));

        /**
         * Deletes vehicle from initial TaxoPark
         */
        taxoparkManager.deleteVehicleFromTaxoPark(taxoPark, taxoPark.getListOfVehicles().get(11));
        System.out.println("\n[Delete last vehicle from TaxoPark:]");
        taxoparkManager.printTaxoParkInfo(taxoPark);
    }
}
