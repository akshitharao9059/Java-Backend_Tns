package com.tnsif.intro.LambdaExpression;

public class OperationTest {
	public static void main(String [] args) {
 Operation addition=(a,b)->a+b;
 Operation division=(a,b)->a/b;
 Operation multiplication=(a,b)->a*b;
 int x = 13, y =4;

 System.out.println("Add: " + addition.apply(x, y));
 System.out.println("Subtract: " + division.apply(x, y));
 System.out.println("Multiplication: " + multiplication.apply(x, y));

}
}

