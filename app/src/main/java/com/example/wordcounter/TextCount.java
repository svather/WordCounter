package com.example.wordcounter;

public class TextCount {
    public static String textCount(String text){

        text = text.replace("\n", " ");
        String[] textArray = text.split(" ");
        String[] charArray = text.split("");
        String[] punctuationArray = text.split("[,.!?]");

        String textCounted = ("Words: " +  textArray.length + "Char: " + (charArray.length - 1) + "Punct: " + (punctuationArray.length - 1));
        return textCounted;
    }
}
