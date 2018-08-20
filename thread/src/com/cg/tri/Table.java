package com.cg.tri;

public class Table {
	 public static void main (String[] args) 
	    {
	         
	        try
	        {
	            String str = "123";
	             
	            int num = Integer.parseInt(str);
	            Runnable runner = () -> { System.out.println("Hello World!"); };
	            // this statement will execute
	            // as no any exception is raised by above statement
	            System.out.println("Inside try block");
	        }
	         
	        finally
	        {
	            System.out.println("finally block executed");
	        }
	         
	        // rest program will be executed
	        System.out.println("Outside try-finally clause");
	    }
}
