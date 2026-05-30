package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;

public class LongestWord {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","date","Pineapple");
        String reduce = list.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(reduce);
    }
}
