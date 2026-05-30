package com.infotech.java8.intermediateOp;
//Question 38: Get the Top 5 Highest Salaries from a List of Employees

import com.infotech.java8.intermediateOp.Model.Employee;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TopFiveHighestSalaries {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alice", 50000));
        employeeList.add(new Employee("Bob", 60000));
        employeeList.add(new Employee("Charlie", 45000));
        employeeList.add(new Employee("David", 55000));
        employeeList.add(new Employee("Eve", 70000));
        employeeList.add(new Employee("Frank", 80000));
        employeeList.add(new Employee("Grace", 90000));
        employeeList.add(new Employee("Hank", 40000));

        List<Employee> collect = employeeList.stream()
            //.sorted(Comparator.comparingDouble(Employee::getSalary))
            .sorted((a,b) -> Double.compare(a.getSalary(), b.getSalary()))
            .limit(5)
            .collect(Collectors.toList());
        System.out.println(collect);
    }
}
