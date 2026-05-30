package com.infotech.java8.intermediateOp;
// Question 11: Filter Even Numbers from a List


import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().filter(e->e%2==0).toList().forEach(System.out::println);
    }
}
