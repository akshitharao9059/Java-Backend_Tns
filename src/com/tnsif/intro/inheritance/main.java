package com.tnsif.intro.inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
} class main {

 public static void main(String[] args) {
    Dog d = new Dog();
    d.eat();   // inherited
    d.bark();  // own method
}
}
