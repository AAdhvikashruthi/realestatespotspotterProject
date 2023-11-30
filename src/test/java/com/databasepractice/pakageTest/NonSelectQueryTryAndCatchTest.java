package com.databasepractice.pakageTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQueryTryAndCatchTest {
	
	public static void main(String[] args) throws SQLException {
		int result =0;
	     Connection con = null;
		try
        {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
		Statement state = con.createStatement();
		String query = "insert into student values('varu','4444',25);";
		
		result = state.executeUpdate(query);
		
		if(result==1)
		{
			System.out.println("data inserted succesfully");
		}
		else
		{
			System.err.println("data is not updated");
		}
	}
		catch(Exception e)
		{
			
		}
		finally
		{
			con.close();
		}
		
	}

}

