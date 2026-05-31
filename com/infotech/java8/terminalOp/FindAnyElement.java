package com.infotech.java8.terminalOp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry");
        Optional<String> any = list.stream().findAny();
        any.ifPresent(System.out::println);
    }
}
