package com.brainacad.oop.testmap2_15_6;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by R2-D2 on 20.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTranslator translator = new MyTranslator();
        translator.addNewWord("cat", "кот");
        translator.addNewWord("mouse", "мышь");
        translator.addNewWord("dog", "собака");
        translator.addNewWord("caught", "поймал");
        translator.addNewWord(" ", " ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input, " ", true);
        StringBuilder output = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            output.append(translator.translate(tokenizer.nextToken()));
        }
        System.out.println(output);
    }
}
