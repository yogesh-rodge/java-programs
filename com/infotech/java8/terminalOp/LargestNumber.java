package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LargestNumber {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(5, 3, 9, 1, 7);
        Optional<Integer> reduce = number.stream()
            .reduce((num1, num2) -> num1 > num2 ? num1 : num2);
        reduce.ifPresent(s -> System.out.println(s));

        Optional<Integer> max = number.stream().max((a, b) -> a.compareTo(b));
        System.out.println(max.get());

        Integer integer = number.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(integer);
    }
}
