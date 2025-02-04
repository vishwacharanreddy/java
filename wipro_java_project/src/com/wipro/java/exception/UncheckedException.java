package com.wipro.java.exception;

public class UncheckedException {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Will cause ArithmeticException (UncheckedException)
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught: " + e.getMessage());
        }
    }
}

