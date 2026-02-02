package com.tnsif.intro.task;
import java.util.Scanner;
public class palendromornot {
	
	    public static void main(String args[]) {

	        int number, originalNumber, reversedNumber = 0, digit;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        number = sc.nextInt();

	        originalNumber = number;

	        while (number > 0) {
	            digit = number % 10;                     // get last digit
	            reversedNumber = reversedNumber * 10 + digit;
	            number = number / 10;                    // remove last digit
	        }

	        if (originalNumber == reversedNumber) {
	            System.out.println("The number is Palindrome");
	        } else {
	            System.out.println("The number is Not Palindrome");
	        }
	    }
	}

