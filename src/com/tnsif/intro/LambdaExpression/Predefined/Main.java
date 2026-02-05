package com.tnsif.intro.LambdaExpression.Predefined;


	import java.util.function.Consumer;
	import java.util.function.Predicate;
	import java.util.function.Supplier;
	public class Main {
	   public static void main(String[] args) {
			Myinterface myinf=()->System.out.println("printing");
			myinf.print();
			Predicate<Integer> p=(n)->n%2==0;
			System.out.println(p.test(8));
			Consumer<String>con=(name)->System.out.println("Lower to Capital letter:"+name.toUpperCase());
			con.accept("nikitha");
			Supplier<Double>sup=()->Math.random();
			System.out.println("Random number is:"+sup.get());
		}

	}

