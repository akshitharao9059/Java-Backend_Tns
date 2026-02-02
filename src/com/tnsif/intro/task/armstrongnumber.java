package com.tnsif.intro.task;

public class armstrongnumber {

	    public static void main(String args[]) {

	        int num = 153;
	        int temp = num;
	        int sum = 0;
	        int digit;

	        while (num > 0) {
	            digit = num % 10;
	            sum = sum + (digit * digit * digit);
	            num = num / 10;
	        }

	        if (temp == sum)
	            System.out.println("Armstrong number");
	        else
	            System.out.println("Not an Armstrong number");
	    }
	}

