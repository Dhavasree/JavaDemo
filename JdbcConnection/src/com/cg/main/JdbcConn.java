package com.cg.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
	
	        PreparedStatement createPreparedStatement = null;
	        PreparedStatement insertPreparedStatement = null;
	        
   
    	    try {
                con.setAutoCommit(false);
               
   
        String sql="CREATE TABLE PERSON45(id int primary key, name varchar(255))";
        String InsertQuery = "INSERT INTO PERSON45" + "(id, name) values" + "(?,?)";
        createPreparedStatement = con.prepareStatement(sql);
        createPreparedStatement.executeUpdate();
        createPreparedStatement.close();
        
        insertPreparedStatement = con.prepareStatement(InsertQuery);
        insertPreparedStatement.setInt(1, 1);
        insertPreparedStatement.setString(2, "dhava");
        insertPreparedStatement.executeUpdate();
        
        insertPreparedStatement = con.prepareStatement(InsertQuery);
        insertPreparedStatement.setInt(1, 44);
        insertPreparedStatement.setString(2, "kavi");
        insertPreparedStatement.executeUpdate();
        insertPreparedStatement.close();
        
        con.commit();
    	    } catch (SQLException e) {
                System.out.println("Exception Message " + e.getLocalizedMessage());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                con.close();
            }
        }
        /*stmt.executeUpdate(sql);
        System.out.println("Table created");
        stmt.close();
        con.close();*/
	}


