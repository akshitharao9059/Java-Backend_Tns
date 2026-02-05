package com.tnsif.intro.banking;
import java.util.Scanner;

class BankAccount {

    int accountNumber;
    String name;
    double balance;

    // Constructor
    BankAccount(int accNo, String n, double bal) {
        accountNumber = accNo;
        name = n;
        balance = bal;
    }

    // Deposit Method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display Balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        BankAccount user = new BankAccount(accNo, name, 1000);

        int choice;
        do {
            System.out.println("\n1.Deposit  2.Withdraw  3.Check Balance  4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double dep = sc.nextDouble();
                    user.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double wit = sc.nextDouble();
                    user.withdraw(wit);
                    break;

                case 3:
                    user.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);
    }
}

