package com.brainacad.oop.testmygen2_15_4_and_5;

import java.util.List;
import java.util.Set;

/**
 * Created by m18 on 18.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        // Lab 2.15.4
        MyNumGenerator myNumGenerator = new MyNumGenerator(5, 64);
        List<Integer> list = myNumGenerator.generate();
        System.out.println(list);

        // Lab 2.15.5
        System.out.println();
        Set set = myNumGenerator.generateDistinct();
        System.out.println(set);
    }
}
