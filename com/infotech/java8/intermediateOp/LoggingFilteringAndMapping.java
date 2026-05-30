package com.infotech.java8.intermediateOp;
// Question 32: Log the Filtering and Mapping Process in a Stream



import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LoggingFilteringAndMapping {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Cherry","date");
        Set<String> collect = list.stream()
            .filter(s -> s.length() > 5)
            .peek(s -> System.out.println("Filtered Elements ==> " + s))
            .map(String::toUpperCase)
            .peek(s -> System.out.println("Uppercase Elements ==> " + s))
            .collect(Collectors.toSet());
        System.out.println(collect);

    }
}
