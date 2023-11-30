package com.databasepractice.pakageTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class RmgYantraTest {

	public static void main(String[] args) throws SQLException {
		
		Connection con=null;

		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver:8084/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//sign into rmg yantra
		
		driver.findElement(By.name("username")).sendKeys("rmgyantra");
		driver.findElement(By.name("password")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		//
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.name("projectName")).sendKeys("TY_PROJ_37");
		driver.findElement(By.name("createdBy")).sendKeys("Deepika HR");
		
		WebElement status = driver.findElement(By.xpath("//select[@name='status']"));
		
		Select s = new Select(status);
		s.selectByVisibleText("Created");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		//to validate
		try
		{
		Driver driver1 = new Driver();
		DriverManager.registerDriver(driver1);
		con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
		Statement state = con.createStatement();
		
	   	String ExpData = "TY_PROJ_37";
		state.executeUpdate(ExpData);
		
	   	String query = "select* from project;";
	   	ResultSet result = state.executeQuery(query);
	   	boolean flag = false;
	   	while(result.next())
	   	{
	   		String actual = result.getString(4);
	   		if(actual.equalsIgnoreCase(ExpData))
	   		{
	   			flag=true;
	   			break;
	   		}
	   		
	   	}
	   	if(flag)
	   	{
	   		System.out.println("project get created succesfully");
	   	}
	   	else
	   	{
	   		System.out.println("project is not created");
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
