package com.infotech.java8;

import java.util.stream.IntStream;

// Question 10: Convert a String into a Character Stream and Count Vowels

public class StreamToCharacterStreamEx10 {
    public static void main(String[] args) {
        String input ="Hello, World";
        IntStream chars = input.chars();
        long count = chars.mapToObj(i -> i)
            .filter(r -> "aeiou".indexOf(r) != -1)
            .count();
        System.out.println("Number of Vowels = "+count);
    }
}
