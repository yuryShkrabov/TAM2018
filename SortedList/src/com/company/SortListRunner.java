package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListRunner {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("simpleExampleOfString", "yury", "baby-doll", "summer", "12", "x", "some", "124sdsd3YYY");
        Collections.shuffle(list);
        System.out.println("Initial list:\n"+list+"\n");
        String x = null;
        SortList.sortAscending(list, x);
        System.out.println("Sorted in ascending:\n"+list+"\n");
        SortList.sortDescending(list, x);
        System.out.println("Sorted in descending:\n"+list+"\n");
    }
}

