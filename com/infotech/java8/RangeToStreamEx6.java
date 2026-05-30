package com.infotech.java8;
// Question 6: Create a Stream from a Range of Numbers (1 to 100)

import java.util.stream.IntStream;

public class RangeToStreamEx6 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100).forEach(System.out::println);
    }
}
