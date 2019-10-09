package com.example.wordcounter;

public class TextCount {
    public static String textCount(String text){

        text = text.replace("\n", " ");
        String[] textArray = text.split("\\s+");
        String[] charArray = text.split("");
        String[] punctuationArray = text.split("[,.!?]");

        String textCounted = String.format("Words: %s Char %s Punct %s", textArray.length, charArray.length, punctuationArray.length);
        return textCounted;
    }
}
