package com.infotech.java8.intermediateOp;

//Question 14: Convert a List of Strings to Uppercase

import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","date");
        List<String> stringList = list.stream().map(String::toUpperCase).toList();
        System.out.println(stringList);

    }
}
