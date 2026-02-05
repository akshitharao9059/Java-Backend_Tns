package com.tnsif.intro.exceptionHandling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class checkedException {
	 public static void abc()throws IOException {
    	 File ff=new File("abc.txt");
    	 FileReader fr=new FileReader(ff);
     }
     public static void main(String[] args) {
    	 try{
     
    	 abc();
     }
    	 catch(Exception e) {
     
    	 System.out.println("file is not found");
     }
}
}

