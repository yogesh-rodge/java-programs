package com.infotech.java8;
// Question 2: Convert a List into a Stream and Print All Elements

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListToStreamExampleProgram2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println);

    }
}
