package com.infotech.java8.intermediateOp;

// Question 33: Debug an Issue by Printing Elements at Each Stage

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DubbingStreamPipeline {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Set<Integer> collect = list.stream()
            .peek(s -> System.out.println("Original Element => " + s))
            .filter(i -> i % 2 == 0)
            .peek(s -> System.out.println("Filtered Element => " + s))
            .map(s -> s * s)
            .peek(s -> System.out.println("Squared Element => "+s))
            .collect(Collectors.toSet());
        System.out.println(collect);
    }
}
