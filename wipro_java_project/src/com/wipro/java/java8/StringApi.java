package com.wipro.java.java8;

public class StringApi {

    public static void main(String[] args) {
        String text = "Super Hero";
        System.out.println(text.length());
        System.out.println(text.charAt(6));
        System.out.println(text.substring(6, 10));
        System.out.println(text.contains("er"));
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
