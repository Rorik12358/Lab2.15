package com.brainacad.oop.testmygen2_15_4_and_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by m18 on 18.03.2016.
 */
public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    // Lab 2.15.4:
    public List<Integer> generate() {
        List output = new ArrayList<>();
        for (int i = 0; i < numOfElm; i++) {
            Integer a = (int) (maxNumb * Math.random());
            output.add(a);
        }
        return output;
    }

    //Lab 2.15.5:
    public Set<Integer> generateDistinct() {
        Set set = new HashSet<>();
        while (set.size() < numOfElm) {
            set.add((int) (maxNumb * Math.random()));
        }
        return set;
    }
}
