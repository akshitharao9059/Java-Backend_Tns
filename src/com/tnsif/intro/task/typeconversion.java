package com.tnsif.intro.task;

public class typeconversion {

	public static void main(String[] args) {
	
		int a = 20;
        double b = a;   // automatic

        System.out.println("Implicit Conversion:");
        System.out.println("Int value: " + a);
        System.out.println("Double value: " + b);

        // Explicit Conversion (Narrowing)
        double x = 15.8;
        int y = (int) x;   // manual casting

        System.out.println("\nExplicit Conversion:");
        System.out.println("Double value: " + x);
        System.out.println("Int value: " + y);
    }

	}


