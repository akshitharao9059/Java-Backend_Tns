package com.tnsif.intro.task;

public class nestedtry {

	public static void main(String[] args) {

        try {
            // Outer try block
            int a = 10 / 2;
            System.out.println("Outer Try Result: " + a);

            try {
                // Inner try block
                int b = 10 / 0;   // causes exception
                System.out.println("Inner Try Result: " + b);
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Cannot divide by zero");
            }

        } catch (Exception e) {
            System.out.println("Outer Catch: Exception Occurred");
        }

        System.out.println("Program Continues...");
    }
}

	


