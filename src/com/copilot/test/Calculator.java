package com.copilot.test;

public class Calculator {
    // Adds two integers and returns the result
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts b from a and returns the result
    public int subtraction(int a, int b) {
        return a - b;
    }

    // Multiplies two integers and returns the result
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides a by b and returns the result; throws ArithmeticException on division by zero
    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("division by zero is not allowed");
        }
        return a / b;
    }
}