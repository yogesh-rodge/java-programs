package com.infotech.java8.terminalOp;

import com.infotech.java8.intermediateOp.Model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindPersonOlderThan25 {
    public static void main(String[] args) {

        List<Person> list = Arrays.asList(
            new Person("Alice",22),
            new Person("Bob",30),
            new Person("Charlie",28),
            new Person("David",20)
        );
        Set<Person> collect = list.stream().filter(s -> s.getAge() > 25).collect(Collectors.toSet());
        collect.stream().findFirst().ifPresent(System.out::println);


    }

}
