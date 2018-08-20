package com.cg.thread;

public class ThreadB extends Thread{  
	Table t;  
	ThreadB(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
	}   


