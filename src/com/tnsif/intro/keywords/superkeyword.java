package com.tnsif.intro.keywords;
class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void showColor() {
        System.out.println("Dog Color: " + color);
        System.out.println("Animal Color: " + super.color);
    }
}

public class superkeyword {
	  public static void main(String[] args) {

	        Dog d = new Dog();
	        d.showColor();
	    }
}
