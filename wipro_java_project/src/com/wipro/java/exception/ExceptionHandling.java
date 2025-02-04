package com.wipro.java.exception;

public class ExceptionHandling {
	public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0;  // Division by zero will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching ArithmeticException and printing message
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            // This block will always execute, regardless of exception
            System.out.println("Execution finished.");
        }
    }
}