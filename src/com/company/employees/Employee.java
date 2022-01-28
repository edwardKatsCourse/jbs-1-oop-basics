package com.company.employees;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;


    // по-месячная ЗП
    // почасовая

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getMonthlySalary() {
        return this.salary;
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
}
