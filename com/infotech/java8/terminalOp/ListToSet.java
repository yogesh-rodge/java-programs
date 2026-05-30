package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","apple");
        Set<String> collect = list.stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
