package com.infotech.java8.intermediateOp;
// Question 25: Extract Unique Numbers from a List of Integer Arrays

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ExtractUniqueNumbers {
    public static void main(String[] args) {
        List<int[]> listOfArrays = Arrays.asList(
            new int[]{1, 2},
            new int[]{3, 4},
            new int[]{5, 6}
        );

        IntStream intStream = listOfArrays.stream().flatMapToInt(Arrays::stream);
        intStream.forEach(System.out::println);
    }
}
