package com.infotech.java8.intermediateOp.Model;

public class Person {
    int age;
    String name;

    public Person(String name, int id) {
        this.age = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
            "id=" + age +
            ", name='" + name + '\'' +
            '}';
    }
}
