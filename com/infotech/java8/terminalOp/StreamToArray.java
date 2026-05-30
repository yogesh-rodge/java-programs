package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;

public class StreamToArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] array = list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));

    }
}
