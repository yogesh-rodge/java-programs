package com.infotech.java8.intermediateOp;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintFirstThreeElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Set<Integer> collect = numbers.stream()
            .limit(3)
            .collect(Collectors.toSet());
        System.out.println("First Three Element => "+collect);
    }
}
