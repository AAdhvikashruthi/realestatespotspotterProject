package com.databasepractice.pakageTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQueryTest {

	public static void main(String[] args) throws SQLException {

		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
		Statement state = con.createStatement();
		String query = "insert into student values('paru','4444',25);";
		
		int result = state.executeUpdate(query);
		if(result==1)
		{
			System.out.println("data inserted succesfully");
		}
		else
		{
			System.err.println("data is not updated");
		}
		con.close();
	}

}
