package com.infotech.java8.terminalOp;

// Question 42: Print Key-Value Pairs of a Map Using

import java.util.HashMap;
import java.util.Map;

public class PrintMapEntries {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
