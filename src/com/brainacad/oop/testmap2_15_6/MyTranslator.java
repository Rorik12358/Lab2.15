package com.brainacad.oop.testmap2_15_6;

import java.util.HashMap;

/**
 * Created by m18 on 18.03.2016.
 */
public class MyTranslator {
    private HashMap<String, String> dictionary;

    public MyTranslator(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }

    public String translate(String en) {
        return "need ro solve";
    }
}
