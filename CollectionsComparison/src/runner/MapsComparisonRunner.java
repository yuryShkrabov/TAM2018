package runner;

import com.company.Constants;
import com.company.OperationType;
import com.company.service.MapManager;

import java.util.HashMap;
import java.util.TreeMap;

public class MapsComparisonRunner {

    public static void main(String[] args) {

        MapManager mapManager = new MapManager();

        HashMap<Integer, Integer> hashMap = mapManager.createRandomHashMap(Constants.QUANTITY_OF_ELEMENTS);
        System.out.println("hashmap: " + hashMap.size());

        TreeMap<Integer, Integer> treeMap = mapManager.createRandomTreeMap(Constants.QUANTITY_OF_ELEMENTS);
        System.out.println("treemap: " + treeMap.size());

        // add elements
        System.out.println("\n[Add elements:]\n");
        mapManager.addElementsToMap(hashMap);
        mapManager.printSpentTime(OperationType.ADD_ELEMENTS);

        mapManager.addElementsToMap(treeMap);
        mapManager.printSpentTime(OperationType.ADD_ELEMENTS);

        // find elements
        System.out.println("\n[Find elements:]\n");
        mapManager.findElementsInMap(hashMap);
        mapManager.printSpentTime(OperationType.FIND_ELEMENTS);

        mapManager.findElementsInMap(treeMap);
        mapManager.printSpentTime(OperationType.FIND_ELEMENTS);

        //Delete elements
        System.out.println("\n[Delete elements:]\n");
        mapManager.deleteElementsFromMap(hashMap);
        mapManager.printSpentTime(OperationType.DELETE_ELEMENTS);

        mapManager.deleteElementsFromMap(treeMap);
        mapManager.printSpentTime(OperationType.DELETE_ELEMENTS);
    }
}
