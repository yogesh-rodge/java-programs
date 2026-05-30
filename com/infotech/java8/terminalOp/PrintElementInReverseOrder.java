package com.infotech.java8.terminalOp;
//Question 43: Print Elements in Reverse Order Using

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintElementInReverseOrder {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6, 1, 2, 3, 4, 5);
        Collections.reverse(list);
        list.stream().forEachOrdered(System.out::println);

    }
}
