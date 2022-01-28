package com.company.appl;

import com.company.employees.Employee;
import com.company.employees.HourlyEmployee;
import com.company.employees.MonthlyEmployee;
import com.company.test.SomeClass;

public class Main {

    public static void main(String[] args) {
        // Object Oriented Programming

        // Encapsulation
        //  public
        //  private

        // package default
        // protected


        // Inheritance

        Employee parentEmployee = new Employee("Aaa", 100500);

        MonthlyEmployee monthlyEmployee = new MonthlyEmployee("Peter", 10000., 1.2);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Susan", 15.5, 156);


//        System.out.println("parent " + parentEmployee.getMonthlySalary());
//        System.out.println("monthly " + monthlyEmployee.getMonthlySalary());
//        System.out.println("freelancer " + freelancerEmployee.getMonthlySalary());
//
//        System.out.println("hourly " + hourlyEmployee.getMonthlySalary());


        // Polymorphism
        Employee[] employees = new Employee[4];
        employees[0] = parentEmployee;
        employees[1] = monthlyEmployee;
        employees[2] = hourlyEmployee;

        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary += employees[i].getMonthlySalary();

            printEmployee(employees[i]);
        }

        System.out.println("Total salary: " + totalSalary);




        // public - всему миру
        // protected - "одно.. классникам/курсникам" + детЯм
        // (package default) - "одно.. классникам/курсникам"
        // private - только внутри класса (от скобки до скобки)


    }

    static void printEmployee(Employee employee) {
        System.out.println(employee.getName() + " " + employee.getMonthlySalary());
    }

}
