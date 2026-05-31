package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckForNegativeNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, -3, 4, 5);
        Set<Integer> collect = list.stream().filter(i -> i < 0).collect(Collectors.toSet());
        System.out.println(collect);

        boolean b = list.stream().anyMatch(i -> i < 0);
        System.out.println(b);

    }
}
