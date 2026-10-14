package com.example;

public class App {
    public int countVowels(String s) {
    if (s == null) {
        throw new IllegalArgumentException("Input cannot be null");
    }

    int count = 0;

    for (char c : s.toLowerCase().toCharArray()) {
        if ("aeiou".indexOf(c) >= 0) {
            count++;
        }
    }

    return count;
}
}
