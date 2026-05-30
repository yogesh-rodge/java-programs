package com.infotech.java8.intermediateOp;
// Question 31: Print Each Element While Processing a Stream

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintElementWhileProcessing {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> collect = list.stream()
            .peek(s -> System.out.println("Processing Element => " + s))
            .filter(s -> s % 2 == 0)
            .peek(s -> System.out.println("Filtering even number => " + s))
            .map(s -> s * s)
            .collect(Collectors.toList());
        System.out.println(collect);
    }
}
