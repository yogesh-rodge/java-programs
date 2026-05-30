package com.infotech.java8.intermediateOp;
// Question 35: Print Elements That Are Getting Filtered Out


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintFilteredOutElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Set<Integer> collect = numbers.stream().peek(
                s -> {
                    if (s % 2 == 0) {
                        System.out.println("Even Element => " + s);
                    }
                }).filter(s -> s % 2 == 0)
            .collect(Collectors.toSet());
        System.out.println(collect);
    }
}
