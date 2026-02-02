package com.tnsif.intro.task;
import java.util.Scanner;
public class reverseastring {
	    public static void main(String args[]) {

	        String originalString;
	        String reversedString = "";

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        originalString = sc.nextLine();

	        for (int i = originalString.length() - 1; i >= 0; i--) {
	            reversedString = reversedString + originalString.charAt(i);
	        }

	        System.out.println("Reversed string: " + reversedString);
	    }
	}

