package com.infotech.java8.intermediateOp;
//Question 15: Convert a List of Integers to Their Squared Values

import java.util.Arrays;
import java.util.List;

public class SqureInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().map(s -> s * s).toList().forEach(System.out::println);
    }
}
