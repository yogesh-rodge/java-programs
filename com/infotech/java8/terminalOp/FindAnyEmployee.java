package com.infotech.java8.terminalOp;

import com.infotech.java8.intermediateOp.Model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyEmployee {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("Alice",20),
            new Employee("Bob",30),
            new Employee("Charlie",40)
        );

        Optional<Employee> any = list.stream().findAny();
        any.ifPresent(System.out::println);

    }
}
