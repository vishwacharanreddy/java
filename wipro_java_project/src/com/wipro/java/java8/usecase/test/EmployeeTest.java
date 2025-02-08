package com.wipro.java.java8.usecase.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    private Employee employee;

    @Before
    public void setUp() {
        // Updated Employee details
        employee = new Employee(2, "Shyam", 7000.0);
    }

    @Test
    public void testGetId() {
        assertEquals(2, employee.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Shyam", employee.getName());
    }

    @Test
    public void testGetSalary() {
        assertEquals(7000.0, employee.getSalary(), 0.01);
    }

    @Test
    public void testIncreaseSalary() {
        employee.increaseSalary(1500.0);
        assertEquals(8500.0, employee.getSalary(), 0.01);
    }
}
