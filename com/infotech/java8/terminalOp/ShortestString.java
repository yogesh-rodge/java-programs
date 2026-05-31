package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ShortestString {
    public static void main(String[] args) {
        List<String> join = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        Optional<String> reduce = join.stream()
            .reduce((word1, word2) -> word1.length() < word2.length() ? word1 : word2);
        reduce.ifPresent(s -> System.out.println(s));
    }
}
