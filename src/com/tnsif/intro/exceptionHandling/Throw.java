package com.tnsif.intro.exceptionHandling;

public class Throw {
	 public static void main(String[] args) {

	        int marks = 30;

	        if (marks < 35) {
	            throw new ArithmeticException("You are Failed");
	        }

	        System.out.println("You are Passed");
	    }
	}