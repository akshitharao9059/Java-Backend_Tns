package com.tnsif.intro.java.student;

public class studentdemo {
	public static void main(String[] args) {
		student s= new student();
        s.setSid(101);
        s.setSname("Akshitha");
        s.setMarks(85);
        System.out.println("Student ID: " + s.getSid());
        System.out.println("Student Name: " + s.getSname());
        System.out.println("Marks: " + s.getMarks());
        }
 
	}


