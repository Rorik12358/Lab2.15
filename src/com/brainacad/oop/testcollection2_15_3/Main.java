package com.brainacad.oop.testcollection2_15_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by R2-D2 on 16.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            arrayList.add("number_" + i);
            linkedList.add("number_" + i);
        }

        Iterator<String> iterator1 = arrayList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println();

        Iterator<String> iterator2 = linkedList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        //then insert one list into the other by using a ListIterator, inserting at every other location.

        iterator1 = arrayList.iterator();
        iterator2 = linkedList.iterator();
        int i = 1;
        while (iterator1.hasNext() && iterator2.hasNext()) { // if two collections have different size
            if (i % 2 != 0) {
                arrayList.add(i, iterator2.next());
            }
            i++;
        }
        System.out.println();
        for (String el : arrayList) {
            System.out.println(el);
        }

    }
}
