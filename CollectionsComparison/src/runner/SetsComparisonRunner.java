package runner;

import com.company.Constants;
import com.company.OperationType;
import com.company.service.SetManager;

import java.util.HashSet;
import java.util.TreeSet;

public class SetsComparisonRunner {

    public static void main(String[] args) {

        SetManager setManager = new SetManager();

        HashSet<Integer> hashSet = setManager.createRandomHashSet(Constants.QUANTITY_OF_ELEMENTS);
        System.out.println("hashset: " + hashSet.size());

        TreeSet<Integer> treeSet = setManager.createRandomTreeSet(Constants.QUANTITY_OF_ELEMENTS);
        System.out.println("treeset: " + hashSet.size());

        //add elements
        System.out.println("\n[Add elements:]\n");
        hashSet = (HashSet<Integer>) setManager.addElementsToSet(hashSet);
        setManager.printSpentTime(OperationType.ADD_ELEMENTS);

        treeSet = (TreeSet<Integer>) setManager.addElementsToSet(treeSet);
        setManager.printSpentTime(OperationType.ADD_ELEMENTS);

        //find elements
        System.out.println("\n[Find elements:]\n");
        setManager.findElementsInSet(hashSet);
        setManager.printSpentTime(OperationType.FIND_ELEMENTS);

        setManager.findElementsInSet(treeSet);
        setManager.printSpentTime(OperationType.FIND_ELEMENTS);

        // delete elements
        System.out.println("\n[Delete elements:]\n");
        setManager.deleteElementsFromSet(hashSet);
        setManager.printSpentTime(OperationType.DELETE_ELEMENTS);

        setManager.deleteElementsFromSet(treeSet);
        setManager.printSpentTime(OperationType.DELETE_ELEMENTS);
    }
}
