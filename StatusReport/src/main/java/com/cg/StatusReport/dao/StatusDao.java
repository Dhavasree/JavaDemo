package com.cg.StatusReport.dao;

import java.sql.Date;

import com.cg.StatusReport.bean.Status;



public interface StatusDao {

	public Exception addDetails(Status status);
	public Status updateDetails(Status status);
	public boolean isUsernameRegistered(String userName,Date statusReport);
	public Status updateFunction(String userName, Date statusReport1);
}
