package com.infotech.java8;
// Question 1: Create a Stream from an Array of Integers

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysToStreamExampleProgram1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
    }
}
