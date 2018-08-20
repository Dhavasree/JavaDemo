package com.cg.sync;

public class MyThread2 extends Thread{  
	Table1 t;  
	MyThread2(Table1 t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable1(100);  
	}  
	}  