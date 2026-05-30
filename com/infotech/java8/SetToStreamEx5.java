package com.infotech.java8;
// Question 5: Convert a Set to a Stream and Print Its Elements

import java.util.HashSet;
import java.util.Set;

public class SetToStreamEx5 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.stream().forEach(System.out::println);

    }
}
