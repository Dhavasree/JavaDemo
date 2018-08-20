package com.cg.statiscsync;

public class Test {
public static void main(String[] args) {
	//Table obj = new Table();
	
	MyThread1 t1=new MyThread1();
	MyThread2 t2=new MyThread2();  
	t1.start();  
	t2.start();  
	}  
}

