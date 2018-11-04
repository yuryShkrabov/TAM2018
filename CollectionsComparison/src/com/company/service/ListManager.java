package com.company.service;

import com.company.OperationType;

import java.util.*;

public class ListManager {

    private ArrayList<Integer> arrayList;
    private LinkedList<Integer> linkedList;
    private Random random;
    private long startMillis;
    private long endMillis;
    private long spentTime;

    public ArrayList<Integer> createRandomArrayList(int quantityOfElements) {
        arrayList = new ArrayList<Integer>();
        random = new Random();
        for (int i = 0; i < quantityOfElements; i++) {
            arrayList.add(i, random.nextInt(9765) + 1);
        }
        return arrayList;
    }

    public LinkedList<Integer> createRandomLinkedList(int quantityOfElements) {
        linkedList = new LinkedList<Integer>();
        random = new Random();
        for (int i = 0; i < quantityOfElements; i++) {
            linkedList.add(i, random.nextInt(9765) + 1);
        }
        return linkedList;
    }

    public void printList(Collection collection) {
        collection.stream().forEach(System.out::println);
    }

    /**
     * Adds 2000 elements to the middle of list
     *
     * @return new arrayList
     */
    public List<Integer> addElementsToList(List<Integer> list) {
        startMillis = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            list.add(6000, 1122112211);
        }
        endMillis = System.currentTimeMillis();
        return list;
    }

    /**
     * Finds 8000 elements from the middle of list
     *
     * @return new arrayList
     */
    public void findElementsInList(List<Integer> list) {
        startMillis = System.currentTimeMillis();
        for (int i = 0; i < 8000; i++) {
            list.get(i + 4000);
        }
        endMillis = System.currentTimeMillis();
    }

    /**
     * Deletes 2000 elements from the middle of list
     */
    public void deleteElementsFromList(List<Integer> list) {
        startMillis = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            list.remove(i + 6000);
        }
        endMillis = System.currentTimeMillis();
    }

    public void printSpentTime(OperationType operationType) {
        switch (operationType) {
            case ADD_ELEMENTS: {
                spentTime = endMillis - startMillis;
                System.out.println("Add 2000 elements to the middle: " + spentTime + " ms");
                startMillis = 0;
                endMillis = 0;
                spentTime = 0;
                break;
            }
            case FIND_ELEMENTS: {
                spentTime = endMillis - startMillis;
                System.out.println("Find 8000 elements: " + spentTime + " ms");
                startMillis = 0;
                endMillis = 0;
                spentTime = 0;
                break;
            }
            case DELETE_ELEMENTS: {
                spentTime = endMillis - startMillis;
                System.out.println("Delete 2000 elements from the middle: " + spentTime + " ms");
                startMillis = 0;
                endMillis = 0;
                spentTime = 0;
                break;
            }
            default: {
                System.out.println("Not supported operation type.");
            }
        }
    }
}
