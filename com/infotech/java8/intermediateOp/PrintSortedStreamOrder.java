package com.infotech.java8.intermediateOp;

// Question 34: Print the Order of Elements in a Sorted Stream

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintSortedStreamOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 9, 1, 7);
        Set<Integer> collect = list.stream().sorted()
            .peek(s -> System.out.println("Sorted element => " + s))
            .collect(Collectors.toSet());
        System.out.println(collect);

    }
}
