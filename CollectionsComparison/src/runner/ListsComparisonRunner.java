package runner;

import com.company.Constants;
import com.company.OperationType;
import com.company.service.ListManager;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListsComparisonRunner {

    public static void main(String[] args) {

        ListManager listManager = new ListManager();
        ArrayList<Integer> arrayList = listManager.createRandomArrayList(Constants.QUANTITY_OF_ELEMENTS);
        System.out.println("arraylist: " + arrayList.size());


        LinkedList<Integer> linkedList = listManager.createRandomLinkedList(Constants.QUANTITY_OF_ELEMENTS);
        System.out.println("linkedList: " + arrayList.size());
        System.out.println();

        //add elements
        System.out.println("\n[Add elements:]\n");
        arrayList = (ArrayList<Integer>) listManager.addElementsToList(arrayList);
        listManager.printSpentTime(OperationType.ADD_ELEMENTS);

        linkedList = (LinkedList<Integer>) listManager.addElementsToList(linkedList);
        listManager.printSpentTime(OperationType.ADD_ELEMENTS);

        //find elements
        System.out.println("\n[Find elements:]\n");
        listManager.findElementsInList(arrayList);
        listManager.printSpentTime(OperationType.FIND_ELEMENTS);

        listManager.findElementsInList(linkedList);
        listManager.printSpentTime(OperationType.FIND_ELEMENTS);

        // delete elements
        System.out.println("\n[Delete elements:]\n");
        listManager.deleteElementsFromList(arrayList);
        listManager.printSpentTime(OperationType.DELETE_ELEMENTS);

        listManager.deleteElementsFromList(linkedList);
        listManager.printSpentTime(OperationType.DELETE_ELEMENTS);
    }
}
