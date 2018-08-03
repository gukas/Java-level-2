package com.gukserg;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Вася");
        words.add("Петя");
        words.add("Вася");
        words.add("Коля");
        words.add("Вася");
        words.add("Петя");
        words.add("Коля");
        words.add("Коля");
        words.add("Коля");
        words.add("Петя");

        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            if (wordsCount.get(words.get(i)) == null) {
                wordsCount.put(words.get(i), 1);
            } else {
                wordsCount.put(words.get(i), wordsCount.get(words.get(i)) + 1);
            }
        }

        System.out.println(words);
        System.out.println(wordsCount);
    }
}
