package com.cg.cls;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClsB {

	public static void main(String[] args) throws IOException {
	ClassA c1=new ClassA(22,"dhava","sree");
	 FileOutputStream fo=new FileOutputStream("new.txt");  
	  ObjectOutputStream out=new ObjectOutputStream(fo);  
	  out.writeObject(c1);  
	  System.out.println("File found");
	 
	}

}
