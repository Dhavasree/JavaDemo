package com.cg.sync;

public class Test {
public static void main(String[] args) {
	Table obj = new Table();
	Table1 obj1 = new Table1();
	MyThread1 t1=new MyThread1(obj);  
	MyThread2 t2=new MyThread2(obj1);  
	t1.start();  
	t2.start();  
	}  
}

