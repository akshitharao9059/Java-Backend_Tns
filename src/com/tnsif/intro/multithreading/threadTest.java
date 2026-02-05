package com.tnsif.intro.multithreading;

public class threadTest {
	 public static void main(String[] args) {

    	 threadDemo task = new  threadDemo();

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

