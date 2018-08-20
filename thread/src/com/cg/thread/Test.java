package com.cg.thread;

public class Test implements Runnable{  
	 public void run(){  
		   System.out.println("running...");  
		   try{
		   Thread.sleep(400);}
		   catch(InterruptedException e){
			   System.out.println("thread");
		   }
	
		 }  
		 public static void main(String args[]){  
		  Test t=new Test();  
		
		  t.run();
		 
		 }  
		}  