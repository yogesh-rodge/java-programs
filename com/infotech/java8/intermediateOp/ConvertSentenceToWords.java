package com.infotech.java8.intermediateOp;
// Question 24: Convert a List of Sentences into a Single List of Words

import java.util.Arrays;
import java.util.List;

public class ConvertSentenceToWords {
    public static void main(String[] args) {
        List<String> sentence = Arrays.asList("Hello World","Java Streams","Flatmap Example");
        List<String> stringList = sentence.stream()
            .flatMap(s -> Arrays.stream(s.split(" ")))
            .toList();
        System.out.println(stringList);
    }
}
