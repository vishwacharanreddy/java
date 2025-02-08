package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.addition(5, 8);
        assertEquals(13, result);
    }

    @Test
    public void testSubtract() {  // Fixed method name
        int result = calculator.subtract(18, 7);
        assertEquals(11, result);
    }

    @Test
    public void testAddWithNegativeNumbers() {
        int result = calculator.addition(-1, -9);
        assertEquals(-10, result);
    }

    @Test
    public void testSubtractWithNegativeNumbers() {  // Fixed method name
        int result = calculator.subtract(-6, -3); // Fixed method call
        assertEquals(-3, result); // Removed non-breaking space issue
    }
}
