package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
        Optional<Integer> first = list.stream()
            .filter(i -> i % 2 == 0)
            .findFirst();
            first.ifPresent(System.out::println);
    }
}
