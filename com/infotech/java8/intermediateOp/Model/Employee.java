package com.infotech.java8.intermediateOp.Model;

public class Employee {
    String name;
    double salary;
    String department;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", salary=" + salary +
            ", department='" + department + '\'' +
            '}';
    }


}
