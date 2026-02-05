package com.tnsif.intro.exceptionHandling;
import java.io.*;
public class Throws {
	 static void checkFile() throws IOException {
	        FileReader f = new FileReader("abc.txt");
	    }

	    public static void main(String[] args) {
	        try {
	            checkFile();
	        } 
	        catch (IOException e) {
	            System.out.println("File not found");
	        }
	    }
	}

