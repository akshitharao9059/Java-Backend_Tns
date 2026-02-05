package com.tnsif.intro.synchronization;

public class Table {
	

	    synchronized void printTable(int n) {   // synchronized method
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(n * i);
	            try {
	                Thread.sleep(400);   // pause for 400ms
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	}

	class MyThread1 extends Thread {
	    Table t;
	    MyThread1(Table t) {
	        this.t = t;
	    }
	    public void run() {
	        t.printTable(5);
	    }
	}

	class MyThread2 extends Thread {
	    Table t;
	    MyThread2(Table t) {
	        this.t = t;
	    }
	    public void run() {
	        t.printTable(10);
	    }
	}

	
