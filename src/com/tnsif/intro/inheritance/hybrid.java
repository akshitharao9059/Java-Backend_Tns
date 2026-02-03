package com.tnsif.intro.inheritance;

//Parent class
class hybrid {
 void showA() {
     System.out.println("This is Parent Class hybrid");
 }
}

//Child B
class B extends hybrid {
 void showB() {
     System.out.println("This is Class B");
 }
}

//Child C
class C extends hybrid {
 void showC() {
     System.out.println("This is Class C");
 }
}

//Child D
class D extends hybrid {
 void showD() {
     System.out.println("This is Class D");
 }
}

//Child E 
class E extends B {
 void showE() {
     System.out.println("This is Class E (Child of B)");
 }
}
