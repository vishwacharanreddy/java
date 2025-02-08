package com.wipro.java.java8.usecase.test;

/**
 * Employee class representing an employee with ID, name, and salary.
 */
public class Employee {

    // Private fields for employee details
    private int id;        // Employee ID
    private String name;   // Employee name
    private double salary; // Employee salary

    /**
     * Constructor to initialize an Employee object.
     *
     */
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Getter method to retrieve the employee ID.
     *
     * @return Employee ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Getter method to retrieve the employee name.
     *
     * @return Employee name.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method to retrieve the employee salary.
     *
     * @return Employee salary.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Method to increase the employee's salary by a specified amount.
     *
     */
    public void increaseSalary(double amount) {
        this.salary += amount;
    }
}
