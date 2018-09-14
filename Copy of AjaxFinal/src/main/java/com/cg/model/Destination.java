package com.cg.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Destination {
	@NotEmpty(message="Enter driver name")
	private String DdriverName;
	@NotEmpty(message="Enter Connection String")
	private String DconnectionString;
	@NotEmpty(message="user name")
	private String DuserName;
	@NotEmpty(message="Enter password")
	private String Dpassword;
	public String getDdriverName() {
		return DdriverName;
	}
	public void setDdriverName(String ddriverName) {
		DdriverName = ddriverName;
	}
	public String getDconnectionString() {
		return DconnectionString;
	}
	public void setDconnectionString(String dconnectionString) {
		DconnectionString = dconnectionString;
	}
	public String getDuserName() {
		return DuserName;
	}
	public void setDuserName(String duserName) {
		DuserName = duserName;
	}
	public String getDpassword() {
		return Dpassword;
	}
	public void setDpassword(String dpassword) {
		Dpassword = dpassword;
	}
	
}
