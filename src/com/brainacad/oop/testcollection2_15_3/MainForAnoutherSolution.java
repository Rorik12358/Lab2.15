package com.brainacad.oop.testcollection2_15_3;

import java.util.*;

/**
 * Created by R2-D2 on 21.03.2016.
 */
public class MainForAnoutherSolution {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            arrayList.add("array number_" + i);
            linkedList.add("linked number_" + i);
        }
        Iterator<String> iteratorArr = arrayList.iterator();
        while (iteratorArr.hasNext()) {
            System.out.println(iteratorArr.next());
        }
        System.out.println();
        Iterator<String> iteratorLinked = linkedList.iterator();
        while (iteratorLinked.hasNext()) {
            System.out.println(iteratorLinked.next());
        }
        //then insert one list into the other by using a ListIterator, inserting at every other location.
        ListIterator<String> listIteratorArr = arrayList.listIterator();
        iteratorLinked = linkedList.iterator();
        while (listIteratorArr.hasNext() && iteratorLinked.hasNext()) {
            listIteratorArr.next();
            listIteratorArr.add(iteratorLinked.next());
        }
        System.out.println();
        for (String el : arrayList) {
            System.out.println(el);
        }
    }
}
