package com.company.employees;

public class HourlyEmployee extends Employee {

    private int hoursCount;

    public HourlyEmployee(String name, double hourlySalary, int hoursCount) {
        super(name, hourlySalary); // String, double
        this.hoursCount = hoursCount;
    }

    @Override
    public double getMonthlySalary() {
        return this.getSalary() * hoursCount;
    }
}
