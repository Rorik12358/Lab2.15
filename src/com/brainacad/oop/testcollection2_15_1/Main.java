package com.brainacad.oop.testcollection2_15_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m18 on 16.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 11; i++){
            list.add("number_"+i);
        }
        for (String el : list){
            System.out.println(el);
        }
    }
}
