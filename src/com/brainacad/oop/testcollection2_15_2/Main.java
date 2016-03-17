package com.brainacad.oop.testcollection2_15_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by m18 on 16.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        for(int i = 0; i < 11; i++){
            Random random = new Random();
            int index = random.nextInt(list.size()+1);
            list.add(index,"number_"+i);
        }
        for (String ell:list) {
            System.out.println(ell);
        }

    }
}
