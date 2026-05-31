package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;

public class CheckForSubstring {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","bob","charlie","date");
        boolean b = list.stream().anyMatch(i -> i.contains("xyz"));
        System.out.println(b);
    }
}
