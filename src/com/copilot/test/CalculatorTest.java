package com.copilot.test;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int passed = 0;
        int failed = 0;

        // Test add
        try {
            int res = calc.add(3, 5);
            if (res == 8) {
                System.out.println("add test passed");
                passed++;
            } else {
                System.out.println("add test failed: expected 8 but got " + res);
                failed++;
            }
        } catch (Exception e) {
            System.out.println("add test threw exception: " + e.getMessage());
            failed++;
        }

        // Test subtraction
        try {
            int res = calc.subtraction(10, 4);
            if (res == 6) {
                System.out.println("subtraction test passed");
                passed++;
            } else {
                System.out.println("subtraction test failed: expected 6 but got " + res);
                failed++;
            }
        } catch (Exception e) {
            System.out.println("subtraction test threw exception: " + e.getMessage());
            failed++;
        }

        // Test multiply
        try {
            int res = calc.multiply(7, 6);
            if (res == 42) {
                System.out.println("multiply test passed");
                passed++;
            } else {
                System.out.println("multiply test failed: expected 42 but got " + res);
                failed++;
            }
        } catch (Exception e) {
            System.out.println("multiply test threw exception: " + e.getMessage());
            failed++;
        }

        // Test division normal
        try {
            int res = calc.division(20, 5);
            if (res == 4) {
                System.out.println("division test passed");
                passed++;
            } else {
                System.out.println("division test failed: expected 4 but got " + res);
                failed++;
            }
        } catch (Exception e) {
            System.out.println("division test threw exception: " + e.getMessage());
            failed++;
        }

        // Test division by zero
        try {
            calc.division(10, 0);
            System.out.println("division by zero test failed: expected exception but none thrown");
            failed++;
        } catch (ArithmeticException e) {
            String expected = "division by zero is not allowed";
            if (expected.equals(e.getMessage())) {
                System.out.println("division by zero test passed");
                passed++;
            } else {
                System.out.println("division by zero test failed: expected message '" + expected + "' but got '" + e.getMessage() + "'");
                failed++;
            }
        } catch (Exception e) {
            System.out.println("division by zero test failed: expected ArithmeticException but got " + e.getClass().getName());
            failed++;
        }

        System.out.println(String.format("Tests completed: %d passed, %d failed", passed, failed));
        if (failed > 0) {
            System.exit(1);
        }
    }
}
