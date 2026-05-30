package com.infotech.java8.intermediateOp;
// Question 19: Extract Unique Characters from a List of Words

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractUniqueCharacter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","banana","cherry");
        Set<Character> collect = list.stream()
            .flatMap(w -> w.chars()
                .mapToObj(c ->(char) c)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
