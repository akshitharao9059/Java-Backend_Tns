package com.tnsif.intro.task;

public class first20primenos {

	public static void main(String[] args) {
		 int count = 0;      // how many prime numbers found
	        int number = 2;     // number to check

	        while (count < 20) {
	            boolean isPrime = true;

	            for (int i = 2; i <= number / 2; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.print(number + " ");
	                count++;
	            }

	            number++;
	        }
	    }
	}	

	


