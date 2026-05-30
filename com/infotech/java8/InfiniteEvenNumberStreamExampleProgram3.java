package com.infotech.java8;
// Question 3: Generate an Infinite Stream of Even Numbers and Print the First 10  Elements

import java.util.stream.IntStream;

public class InfiniteEvenNumberStreamExampleProgram3 {
    public static void main(String[] args) {
      //  IntStream.rangeClosed(1,10).filter(i-> i%2==0).forEach(System.out::println);
        IntStream.iterate(0, n -> n + 2)
            .limit(10)
         .forEach(System.out::println);
    }
}
