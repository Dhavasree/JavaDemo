package com.cg.cls;

import java.io.Serializable;

public class ClassA implements Serializable{
	int age;
	String firstname;
	transient String lastname;
	public ClassA(int age, String firstname, String lastname) {
		super();
		this.age = age;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	}
