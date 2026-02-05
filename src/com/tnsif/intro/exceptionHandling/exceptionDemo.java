package com.tnsif.intro.exceptionHandling;

public class exceptionDemo {
	public static void main(String[] args) {
		   try {
			int n=9;
		    int c=0;
		    int result=n/c;
		    System.out.println(result);
		  }catch(Exception e) {
		   System.out.println("please divide valid number");
		   }finally {
			   System.out.println("closing resource");
		   }
		}
		}

