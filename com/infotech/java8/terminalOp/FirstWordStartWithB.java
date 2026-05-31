package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;

public class FirstWordStartWithB {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Cherry","Blackberry");
        list.stream().filter(s->s.startsWith("B")).findFirst().ifPresent(System.out::println);

    }
}
