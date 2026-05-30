package com.infotech.java8.terminalOp;
// Question 41: Print All Elements of a List Using

import java.util.Arrays;
import java.util.List;

public class PrintListElements {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(System.out::println);

    }
}
