package com.databasepractice.pakageTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Employee {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee name");
		String ename = sc.nextLine();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		//Random age = new Random();
		//int random = age.nextInt();
		try
		{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","root");
		
		Statement state = conn.createStatement();
		String query = "select * from emp;";
		//String Query = "insert into emp values("+ename+ "" +age+");";
		ResultSet result = state.executeQuery(query);
		
		while(result.next())
		{
			String data = result.getString(1);
		//	if(data.equalsIgnoreCase(expecteddata))
			{
				
			}
		}
		
		/*if(result==1)
		{
			
			System.out.println("data is present");
			//System.out.println(ename+" "+age);
			//System.out.println();
		}*/
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
		conn.close();
		}
		
		
	}

}
