package com.company.employees;

public class MonthlyEmployee extends Employee {

    // name, salary

    private double rate;

    public MonthlyEmployee(String name, double salary, double rate) {
        super(name, salary);
        this.rate = rate;
    }

    @Override
    public double getMonthlySalary() {
        return this.getSalary() * this.rate;
    }
}

//class FreelancerEmployee extends MonthlyEmployee {
//    public FreelancerEmployee(String name, double salary, double rate) {
//        super(name, salary, rate);
//    }
//}