package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Array.setArray(arrayList);
        System.out.println();
        Linked.setLinked(linkedList);
        System.out.println();
        Array.getArray(arrayList);
        System.out.println();
        Linked.getLinked(linkedList);
    }
}
