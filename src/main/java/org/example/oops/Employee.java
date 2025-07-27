package org.example.oops;

/**
 * Create a parent class Employee and a child class Manager.
 *
 * Employee class should have:
 *
 * Fields: name, salary
 *
 * Method: displayInfo() – prints name and salary
 *
 * Manager class should extend Employee and include:
 *
 * Extra field: department
 *
 * Override displayInfo() to include department as well
 *
 * In the main method, create a Manager object and call displayInfo().
 */
public class Employee {
    String name;int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(Employee e1) {
        salary=e1.salary;
        name=e1.name;
    }

    public void displayInfo(){
        System.out.println(name+" and Salary is :"+salary);
    }
}
