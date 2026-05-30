package com.infotech.java8.intermediateOp;
// Question 39: Print the Last 5 Elements of a List

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintLastFiveElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int lastFive = list.size() - 5;
        List<Integer> collect = list.stream()
            .skip(lastFive)
            .limit(5)
            .collect(Collectors.toList());
        System.out.println(collect);
    }
}
