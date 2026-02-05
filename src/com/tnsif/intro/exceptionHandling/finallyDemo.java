package com.tnsif.intro.exceptionHandling;

public class finallyDemo {
	public static void main(String[] args) {
        try {
            int num = 5 / 1;
            System.out.println("Result: " + num);
        } 
        catch (Exception e) {
            System.out.println("Error");
        } 
        finally {
            System.out.println("Finally block always runs");
        }
    }
}

