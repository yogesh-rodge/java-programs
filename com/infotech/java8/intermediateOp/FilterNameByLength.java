package com.infotech.java8.intermediateOp;
// Find Names That Contain More Than 5 Letters

import java.util.Arrays;
import java.util.List;

public class FilterNameByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "bob", "charlie", "david", "eve", "Frank","yogesh");
        List<String> stringList = names.stream().filter(e -> e.length() > 5).toList();
        System.out.println(stringList);
    }
}
