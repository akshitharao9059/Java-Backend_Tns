package com.tnsif.intro.exceptionHandling;

public class tryCatchDemo {
	 public static void main(String[] args) {
	        try {
	            int a = 10;
	            int b = 0;
	            int c = a / b;   // Exception occurs here
	            System.out.println(c);
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero");
	        }
	    }
	}
	
