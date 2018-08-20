package com.cg.thread;

public class TestSynchronizedBlock1 {
	public static void main(String args[]){  
		Table obj = new Table();//only one object  
		ThreadB t1=new ThreadB(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
		}  
}
