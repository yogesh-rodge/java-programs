package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordByFirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Avocado");
        Map<Character, List<String>> collect = words.stream().collect(Collectors.groupingBy(e -> e.charAt(0)));
        System.out.println(collect);
    }
}
