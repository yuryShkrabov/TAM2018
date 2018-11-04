package com.company.service;

import com.company.OperationType;

import java.util.*;

public class MapManager {

    private HashMap<Integer, Integer> hashMap;
    private TreeMap<Integer, Integer> treeMap;
    private long startMillis;
    private long endMillis;
    private long spentTime;

    public HashMap<Integer, Integer> createRandomHashMap(int quantityOfElements) {
        hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < quantityOfElements; i++) {
            hashMap.put(i, i + 5945);
        }
        return hashMap;
    }

    public TreeMap<Integer, Integer> createRandomTreeMap(int quantityOfElements) {
        treeMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < quantityOfElements; i++) {
            treeMap.put(i, i + 5945);
        }
        return treeMap;
    }

    public void printMap(Map map) {
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
    }

    /**
     * Adds 2000 elements to map
     *
     * @return new map
     */
    public Map<Integer, Integer> addElementsToMap(Map<Integer, Integer> map) {
        startMillis = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            map.put(i + 6000, i + 0000);
        }
        endMillis = System.currentTimeMillis();
        return map;
    }

    /**
     * Finds 8000 elements from the middle of map
     */
    public void findElementsInMap(Map<Integer, Integer> map) {
        startMillis = System.currentTimeMillis();
        for (int i = 0; i < 8000; i++) {
            //map.contains(i + 10000);
            map.get(i + 4000);
        }
        endMillis = System.currentTimeMillis();
    }

    /**
     * Deletes 2000 elements from the middle of map
     */
    public void deleteElementsFromMap(Map<Integer, Integer> map) {
        startMillis = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            map.remove(i + 6000);
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
