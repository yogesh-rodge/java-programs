package com.infotech.java8.intermediateOp;
// Question 29: Sort Numbers in Descending Order

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class SortNumberDescending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 9, 1, 7);
        List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list1);

        List<Integer> list2 = list.stream().sorted().toList();
        System.out.println(list2);

    }
}
