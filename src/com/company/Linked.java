package com.company;

import java.util.LinkedList;
import java.util.Random;

public class Linked {
    public static LinkedList setLinked(LinkedList linkedList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        long stop = System.currentTimeMillis() - start;
        System.out.println("Время выполнения setLinked: " + stop + " ms");
        return linkedList;
    }

    public static void getLinked(LinkedList linkedList) {
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            System.out.println(linkedList.get(random.nextInt(linkedList.size())));
        }
        long stop = System.currentTimeMillis() - start;
        System.out.println("Время выполнения getLinked: " + stop + " ms");
    }
}
