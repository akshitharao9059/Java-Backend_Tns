package com.tnsif.intro.multithreading;

public class threadDemo implements Runnable  {
	public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                Thread.currentThread().getName() + " : " + i
            );
        }
    }
}




