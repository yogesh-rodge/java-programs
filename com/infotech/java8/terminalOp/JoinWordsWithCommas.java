package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWordsWithCommas {
    public static void main(String[] args) {
        List<String> join = Arrays.asList("Apple", "Banana", "Cherry");
        String collect = join.stream().collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
