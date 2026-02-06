package com.tnsif.intro.jdbc;
import java.util.Scanner;
public class MainAppli {
	 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
	        StudentDAO dao = new StudentDAO();
          while (true) {
	            System.out.println("\n===== Student Management System =====");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Exit");
	            System.out.print("Choose option: ");

	            int choice = sc.nextInt();
	            sc.nextLine(); // clear buffer

	            if (choice == 1) {
	                System.out.print("Enter Name: ");
	                String name = sc.nextLine();
                 System.out.print("Enter Email: ");
	                String email = sc.nextLine();
                  System.out.print("Enter Course: ");
	                String course = sc.nextLine();
	               dao.addStudent(name, email, course);

	            } else if (choice == 2) {
	                dao.viewStudents();

	            } else if (choice == 3) {
	                System.out.println("Thank you! Exiting...");
	                break;

	            } else {
	                System.out.println("Invalid choice!");
	            }
	        }
         sc.close();
	    }
	}

