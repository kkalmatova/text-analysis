package com.karima.text.analysis;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String source = read("nekrasov.txt");
        String text = TextService.removePunctuations(source);
        List<String> wordList = TextService.toWordList(text);
        System.out.println(wordList.size());
    }

    public static String read(String fileName) {
        String str = null;
        try {
            str = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }


}
