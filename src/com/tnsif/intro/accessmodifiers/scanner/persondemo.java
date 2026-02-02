package com.tnsif.intro.accessmodifiers.scanner;

import java.util.Scanner;

 public class PersonDemo {

    public static void main(String[] args) {

        Person p = new Person();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String pname = sc.next();

        System.out.println("Enter salary:");
        int psal = sc.nextInt();

        System.out.println("Enter city:");
        sc.nextLine();   // clear buffer
        String pcity = sc.nextLine();

        // Set values to object
        p.setData(pname, psal, pcity);

        // Display values
        p.display();

        sc.close();
    }
}