package com.cg.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:~/test","hb","");
        Statement stmt=con.createStatement();
        String sql=" INSERT INTO EMPLOYEE1(firstname,lastname,empid,age) VALUES('dhava','sree',1005,22)";
        stmt.executeUpdate(sql);
        System.out.println("Table created");
        stmt.close();
        con.close();
	
	}

}
