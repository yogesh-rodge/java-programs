package com.infotech.java8.intermediateOp;
// Question 36: Print the First 3 Elements of a List

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SkipFirstFiveElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> collect = list.stream()
            .skip(5)
            .collect(Collectors.toSet());
        System.out.println(collect);
    }
}
