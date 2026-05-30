package com.infotech.java8.intermediateOp;
// Question 22: Split a Sentence into Words and Remove Duplicates

import java.util.Arrays;
import java.util.List;

public class SplitSentencesAndRemoveDuplicates {
    public static void main(String[] args) {
        String sentence = "hello world hello";
        List<String> stringList = Arrays.stream(sentence.split(" "))
            .distinct()
            .toList();
        System.out.println(stringList);
    }
}
