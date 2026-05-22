package com.corejava.a1fundamentals;

// Encapsulation example

class Employee {

    // Private variables (hidden data)
    private String name;
    private int salary;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setName("Prasanna");
        employee.setSalary(50000);

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}