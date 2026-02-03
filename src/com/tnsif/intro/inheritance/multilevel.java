package com.tnsif.intro.inheritance;

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class multilevel {

	public static void main(String[] args) {
		
		Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}

	


