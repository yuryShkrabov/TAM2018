package runner;

import object_model.Truck;
import object_model.Usage;
import object_model.sevice.ReadObject;
import object_model.sevice.WriteObject;

import static constants.FilesConstants.PATH_TO_TEXT_FILE;

public class TextFileRunner {

    public static void main(String[] args) {

        Truck truckToWriteToTextFile = new Truck(
                100,
                 Usage.TAXI,
                "truckToWriteToTextFile",
                56.3,
                29.5,
                2011,
                18200);

        Truck truckThatRedFromTextFile = null;
        System.out.println("[Truck object to write to txt file:]");
        truckToWriteToTextFile.printVehicleInfo();

        /**
         * WRITE OBJECT TO TXT FILE
         */
        WriteObject writeToTextFile = new WriteObject();
        writeToTextFile.writeVehicleToTextFile(truckToWriteToTextFile, PATH_TO_TEXT_FILE);

        /**
         * READ OBJECT FROM TXT FILE
         */
        ReadObject readFromTextFile = new ReadObject();
        truckThatRedFromTextFile = (Truck) readFromTextFile.readObjectFromFile(PATH_TO_TEXT_FILE);
        System.out.println("\n[Truck object that is red from txt file:]");
        truckThatRedFromTextFile.printVehicleInfo();
    }
}
