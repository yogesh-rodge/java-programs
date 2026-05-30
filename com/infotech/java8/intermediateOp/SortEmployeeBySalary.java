package com.infotech.java8.intermediateOp;

import com.infotech.java8.intermediateOp.Model.Employee;

// Question 28: Sort a List of Employees by Salary

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = Arrays.asList(
            new Employee("Alice", 50000),
            new Employee("Bob", 60000),
            new Employee("Charlie", 45000),
            new Employee("David", 55000));

        List<Employee> list = listOfEmployee.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary)
            .reversed())
            .toList();
     //   System.out.println(list);

        List<Employee> list1 = listOfEmployee.stream().sorted((a, b) -> -Double.compare(a.getSalary(), b.getSalary())).toList();
        System.out.println(list1);
    }
}
