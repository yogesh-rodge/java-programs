package com.infotech.java8.intermediateOp;
// Question 23: Flatten a List of Arrays into a Single Stream

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlattenListOfArrays {
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
