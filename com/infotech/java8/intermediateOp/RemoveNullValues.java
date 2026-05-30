package com.infotech.java8.intermediateOp;
//Question 13: Remove Null Values from a List Using Streams

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNullValues {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", null, "Banana", null,"Cherry", null);
        List<String> stringList = list.stream().filter(Objects::nonNull).toList();
        System.out.println(stringList);

        List<String> stringList1 = list.stream().filter(s-> s!=null).toList();
        System.out.println(stringList1);
    }
}
