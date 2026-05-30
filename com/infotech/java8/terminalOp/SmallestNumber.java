package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SmallestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 9, 1, 0, 7);
        Optional<Integer> reduce = list.stream().reduce((a, b) -> a < b ? a : b);
        System.out.println(reduce.get());
    }
}
