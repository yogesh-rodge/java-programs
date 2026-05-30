package com.infotech.java8.terminalOp;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int factorial = IntStream.rangeClosed(1, 5)
            .reduce( 1,(a, b) -> a * b);
        System.out.println(factorial);
    }
}
