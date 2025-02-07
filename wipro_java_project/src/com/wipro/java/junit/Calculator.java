package com.wipro.java.junit;

public class Calculator {

    // Addition Method
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    // Subtraction Method (Fixed spelling)
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Multiplication Method
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    // Division Method (Handles divide-by-zero error)
    public double division(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) num1 / num2;
    }

    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Addition: " + calc.addition(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiplication(10, 5));
        System.out.println("Division: " + calc.division(10, 5));
    }
}
