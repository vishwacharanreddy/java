package com.wipro.java.java8.usecase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * EmployeeService class provides business logic for employee management.
 * It includes operations like adding, removing, updating, searching,
 * filtering, and sorting employees.
 */
public class EmployeeService {

    // List to store employee records
    List<Employee> employees = new ArrayList<>();

    /**
     * Adds a new employee to the system.
     *
     * @param emp The Employee object to be added
     */
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee Added: " + emp);
    }

    /**
     * Displays all employees in the system.
     * If no employees exist, prints a message.
     */
    public void displayEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No Employee Records Found.");
        } else {
            for (int i = 0; i < employees.size(); i++) {
                System.out.println(employees.get(i));
            }
        }
    }

    /**
     * Removes an employee by ID.
     *
     * @param removeId The ID of the employee to be removed
     */
    public void removeEmployee(int removeId) {
        boolean removed = employees.removeIf(emp -> emp.getId() == removeId);
        if (removed) {
            System.out.println("Employee with ID " + removeId + " removed.");
        } else {
            System.out.println("Employee with ID " + removeId + " not found.");
        }
    }

    /**
     * Updates the salary of an employee by ID.
     *
     * @param empID      The ID of the employee whose salary needs to be updated
     * @param empSalary  The new salary to be assigned
     */
    public void updateSalary(int empID, double empSalary) {
        employees.stream()
                .filter(emp -> emp.getId() == empID)
                .findFirst()
                .ifPresentOrElse(
                        emp -> {
                            emp.setSalary(empSalary);
                            System.out.println("Updated salary for Employee ID: " + empID);
                        },
                        () -> System.out.println("Employee with ID " + empID + " not found.")
                );
    }

    /**
     * Filters employees by department.
     *
     * @param department The department name to filter employees
     */
    public void filterByDepartment(String department) {
        List<Employee> departments = employees.stream()
                .filter(emp -> emp.getDepartment().trim().equalsIgnoreCase(department.trim()))
                .collect(Collectors.toList());

        if (departments.isEmpty()) {
            System.out.println("No employees found in the " + department + " department.");
        } else {
            for (Employee employee : departments) {
                System.out.println(employee);
            }
        }
    }

    /**
     * Sorts employees by name in ascending order.
     * If no records exist, prints an appropriate message.
     */
    public void sortByEmployeeName() {
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        if (!sortedEmployees.isEmpty()) {
            for (Employee emp : sortedEmployees) {
                System.out.println(emp);
            }
        } else {
            System.out.println("No Employee Records Found.");
        }
    }

    /**
     * Searches for an employee by ID.
     *
     * @param empID The ID of the employee to be searched
     */
	public void searchByEmployeeID(int empID) {
        List<Employee> searchEmployee = employees.stream()
                .filter(emp -> emp.getId() == empID)
                .collect(Collectors.toList());

        if (!searchEmployee.isEmpty()) {
            System.out.println(searchEmployee.get(0)); // Get first matching employee
        } else {
            System.out.println("No Employee Records Found.");
        }
    }
}
