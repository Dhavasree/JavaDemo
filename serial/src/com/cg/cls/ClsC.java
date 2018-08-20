package com.cg.cls;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class ClsC {
	 public static void main(String args[])throws Exception{ 
		 FileInputStream fo=new FileInputStream("new.txt");  
           ObjectInputStream oi=new ObjectInputStream(fo);
           ClassA a=(ClassA)oi.readObject();  
           System.out.println("Age="+a.age+" firstname="+a.firstname+"  lastname="+a.lastname);
}}