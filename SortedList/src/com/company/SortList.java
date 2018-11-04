package com.company;

import java.util.List;

public class SortList {

    public static void sortAscending(List<String> list, String x) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i; j > 0; j--) {

                if (list.get(j).toCharArray().length < list.get(j - 1).toCharArray().length) {
                    x = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, x);
                }
            }
        }
    }

    public static void sortDescending(List<String> list, String x) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i; j > 0; j--) {

                if (list.get(j).toCharArray().length > list.get(j - 1).toCharArray().length) {
                    x = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, x);
                }
            }
        }
    }
}
