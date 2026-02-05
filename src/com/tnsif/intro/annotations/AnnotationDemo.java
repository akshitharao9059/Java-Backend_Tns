package com.tnsif.intro.annotations;
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class AnnotationDemo {
	 public static void main(String[] args) {
	        Dog d = new Dog();
	        d.sound();
	    }
	}

