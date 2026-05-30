package com.infotech.java8.intermediateOp;
// Question 30: Sort a List of Objects Using Multiple Conditions

import com.infotech.java8.intermediateOp.Model.Employee;

import java.util.Arrays;
import java.util.List;

public class SortEmployeeByMultipleConditions {
    public static void main(String[] args) {
       List<Employee> employeeList =  Arrays.asList(
        new Employee("Alice",50000,"HR"),
        new Employee("Bob",60000,"IT"),
        new Employee("Charlie",45000,"HR"),
        new Employee("David",55000,"IT"),
        new Employee("Eve",70000,"Finance"),
           new Employee("Yogesh",60000,"Finance"));

        List<Employee> list = employeeList.stream().sorted(
            (e1,e2) ->{
                int departmentComparison = e1.getDepartment().compareTo(e2.getDepartment());
                if(departmentComparison!=0){
                    return departmentComparison;
                }
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        ).toList();

        System.out.println(list);

    }
}
