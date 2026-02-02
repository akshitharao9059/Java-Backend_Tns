package com.tnsif.intro.task;
import java.util.*;
public class stackexample {

	public static void main(String[] args){
		Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println("Top element: " + stack.peek());
    }
}
	


