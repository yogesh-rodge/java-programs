package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;

public class VerifyWordLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","date");
        boolean b = list.stream().allMatch(s -> s.length() > 3);
        System.out.println(b);
    }
}
