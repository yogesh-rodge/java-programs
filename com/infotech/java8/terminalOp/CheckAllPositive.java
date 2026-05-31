package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;

public class CheckAllPositive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        boolean b = list.stream().allMatch(i -> i > 0);
        System.out.println(b);
    }
}
