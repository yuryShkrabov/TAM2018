package com.company.service;

import com.company.OperationType;

import java.util.*;

public class SetManager {

    private HashSet<Integer> hashSet;
    private TreeSet<Integer> treeSet;
    private long startMillis;
    private long endMillis;
    private long spentTime;

    public HashSet<Integer> createRandomHashSet(int quantityOfElements) {
        hashSet = new HashSet<Integer>();
        for (int i = 0; i < quantityOfElements; i++) {
            hashSet.add(i + 5945);
        }
        return hashSet;
    }

    public TreeSet<Integer> createRandomTreeSet(int quantityOfElements) {
        treeSet = new TreeSet<Integer>();
        for (int i = 0; i < quantityOfElements; i++) {
            treeSet.add(i + 5945);
        }
        return treeSet;
    }

    public void printSet(Set set) {
        set.stream().forEach(System.out::println);
    }

    /**
     * Adds 2000 elements to the middle of set
     *
     * @return new set
     */
    public Set<Integer> addElementsToSet(Set<Integer> set) {
        startMillis = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            set.add(i + 0000);
        }
        endMillis = System.currentTimeMillis();
        return set;
    }

    /**
     * Finds 8000 elements from the middle of set
     */
    public void findElementsInSet(Set<Integer> set) {
        startMillis = System.currentTimeMillis();
        for (int i = 0; i < 8000; i++) {
            set.contains(i + 10000);
        }
        endMillis = System.currentTimeMillis();
    }

    /**
     * Deletes 2000 elements from the middle of set
     */
    public void deleteElementsFromSet(Set<Integer> set) {
        startMillis = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            set.remove(i + 6000);
        }
        endMillis = System.currentTimeMillis();
    }

    public void printSpentTime(OperationType operationType) {
        switch (operationType) {
            case ADD_ELEMENTS: {
                spentTime = endMillis - startMillis;
                System.out.println("Add 2000 elements: " + spentTime + " ms");
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
