package com.infotech.java8.intermediateOp;
// Question 26: Sort a List of Integers in Ascending Order

import java.util.Arrays;
import java.util.List;

public class SortIntegerAscending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 9, 1, 7);
        List<Integer> list1 = list.stream().sorted().toList();
        System.out.println(list1);
    }
}
