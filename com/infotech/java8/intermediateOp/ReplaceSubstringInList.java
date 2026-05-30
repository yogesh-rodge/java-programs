package com.infotech.java8.intermediateOp;

import java.util.Arrays;
import java.util.List;

public class ReplaceSubstringInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","date");
        List<String> stringList = list.stream().map(s -> s.replace("a", "***")).toList();
        System.out.println(stringList);
    }
}
