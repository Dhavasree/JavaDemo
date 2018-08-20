package com.cg.cls;

public class Student implements Cloneable{
	String firstname;
	Department dept;
	String lastname;
	public Student(String firstname, Department dept, String lastname) {
		super();
		this.firstname = firstname;
		this.dept = dept;
		this.lastname = lastname;
	}
	 protected Object clone() throws CloneNotSupportedException 
	    {
	        return super.clone();
	    }

}
