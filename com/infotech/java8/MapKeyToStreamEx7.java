package com.infotech.java8;
// Question 7: Convert a Map’s Keys into a Stream and Print Them

import java.util.HashMap;
import java.util.Map;

public class MapKeyToStreamEx7 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",10);
        map.put("Banana",20);
        map.put("Cherry",30);
        map.put("Date",40);
        map.keySet().stream().forEach(System.out::println);


    }
}
