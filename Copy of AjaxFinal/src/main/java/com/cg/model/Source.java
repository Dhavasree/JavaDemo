package com.cg.model;


import org.hibernate.validator.constraints.NotEmpty;

public class Source {
	@NotEmpty(message="Enter driver name")
	private String driverName;
	@NotEmpty(message="Enter Connection String")
	private String connectionString;
	@NotEmpty(message="Enter user name")
	private String userName;

	@NotEmpty(message="Enter password")
	private String password;
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	}


