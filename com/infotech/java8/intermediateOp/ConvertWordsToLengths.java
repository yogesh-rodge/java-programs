package com.infotech.java8.intermediateOp;
// Question 18: Convert a List of Words to Their Lengths

import java.util.Arrays;
import java.util.List;

public class ConvertWordsToLengths {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "bob", "charlie", "david", "eve", "Frank","yogesh");
        List<Integer> list = names.stream().map(String::length).toList();
        System.out.println(list);
    }
}
