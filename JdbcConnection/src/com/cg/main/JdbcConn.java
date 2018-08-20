package com.cg.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:~/test","hb","");
        Statement stmt=con.createStatement();
        String sql=" CREATE TABLE EMP(firstname VARCHAR(10),lastname VARCHAR(10), empid INTEGER,age INTEGER) ";
        stmt.executeUpdate(sql);
        System.out.println("Table created");
        stmt.close();
        con.close();
	}

}
