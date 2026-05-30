package com.infotech.java8.intermediateOp;
// Question 21: Flatten a List of Lists into a Single List

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlattenListOfList {
    public static void main(String[] args) {
        List<List<Integer>> listOflist = Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(3, 4),
            Arrays.asList(5, 6)
        );

        List<Integer> list = listOflist.stream().flatMap(Collection::stream).toList();
        System.out.println(list);
    }
}
