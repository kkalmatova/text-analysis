package com.karima.text.analysis;


import java.util.ArrayList;
import java.util.List;

public class TextService {

    public static String removePunctuations(String source) {
        return source.replaceAll("\\p{IsPunctuation}", "");
    }

    public static List<String> toWordList(String text) {
        String[] words = text.split(" ");
        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i] != null && !words[i].equals(" ")) {
                wordList.add(words[i]);
            }
        }

        return wordList;
    }
}
