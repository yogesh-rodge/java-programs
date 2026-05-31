package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountDistinctElement {
    public static void main(String[] args) {
        List<Integer> element = Arrays.asList(1,2,2,3,4,4,5);
        Set<Integer> collect = element.stream().distinct().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
