package com.infotech.java8.intermediateOp;
 // Question 12: Extract Strings That Start with ’A’ from a List


import java.util.Arrays;
import java.util.List;

public class FilterStreamStartWithA {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Avocado","Orange","Apricot");
        List<String> stringList = list.stream().filter(e -> e.startsWith("A")).toList();
        System.out.println("String start with 'A'  "+stringList);
    }
}
