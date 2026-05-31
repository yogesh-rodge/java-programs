package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(50000, 60000, 45000, 55000, 70000);
        Integer integer = list.stream()
            .sorted((a,b)-> -Integer.compare(a,b))
            .skip(1)
            .findFirst()
            .get();
        System.out.println(integer);

        Integer integer2 = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer2);
    }
}
