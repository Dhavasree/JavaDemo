package com.cg.sync;

public class Table1 {
	synchronized void printTable1(int n){
		   for(int i=1;i<=5;i++){  
			     System.out.println(n*i);  
			     try{  
			      Thread.sleep(400);  
			     }catch(Exception e){System.out.println(e);}  
			   }  
			  
			 }  

}
