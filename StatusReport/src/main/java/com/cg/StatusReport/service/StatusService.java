package com.cg.StatusReport.service;

import java.sql.Date;
import com.cg.StatusReport.bean.Status;
public interface StatusService {
	public Exception addDetails(Status status);
	public Status updateDetails(Status status);
	 public boolean isUsernameRegistered(String username,Date statusReport);
	public Status updateFunction(String userName, Date statusReport1);
}
