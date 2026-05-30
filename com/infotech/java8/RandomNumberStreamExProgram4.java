package com.infotech.java8;
// Question 4: Create a Stream of Random Numbers and Limit the Output to 5 Elements

import java.util.Random;
import java.util.stream.Stream;

public class RandomNumberStreamExProgram4 {
    public static void main(String[] args) {
        Random random = new Random();
        Stream.generate(random::nextInt)
            .limit(5)
            .forEach(System.out::println);
    }
}
