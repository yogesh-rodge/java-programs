package com.infotech.java8;
// Question 8: Convert a Map’s Values into a Stream and Find the Sum

import java.util.HashMap;
import java.util.Map;

public class MapValueToStreamEx8 {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",10);
        map.put("Banana",20);
        map.put("Cherry",30);
        map.put("Date",40);
        int sum = map.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


    }
}
