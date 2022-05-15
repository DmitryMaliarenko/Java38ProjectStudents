package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Array {
    public static ArrayList setArray(ArrayList arrayList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        System.out.println();
        long stop = System.currentTimeMillis() - start;
        System.out.println("Время выполнения setArray: " + stop + " ms");
        return arrayList;
    }

    public static void getArray(ArrayList arrayList) {
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            System.out.println(arrayList.get(random.nextInt(arrayList.size())));
        }
        long stop = System.currentTimeMillis() - start;
        System.out.println("Время выполнения getArray: " + stop + " ms");
    }
}
