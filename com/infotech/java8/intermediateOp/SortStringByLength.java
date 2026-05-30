package com.infotech.java8.intermediateOp;
// Question 27: Sort a List of Strings by Length

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","date");
        List<String> stringList = list.stream()
            .sorted(Comparator.comparingInt(String::length))
            .toList();
        System.out.println(stringList);
    }
}
