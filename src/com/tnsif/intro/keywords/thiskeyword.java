package com.tnsif.intro.keywords;
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;       // refers to current object variable
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
 class thiskeyword {
	 public static void main(String[] args) {

	        Student s1 = new Student(101, "Akshitha");
	        s1.display();
	    }
}
