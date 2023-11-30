package com.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTestNg {
	
	
	@Test
	public void createTest()
	{
		//System.out.println(" create Tes Metho");
		Reporter.log("create", true);
	}
	@Test
	public void editTest()
	{
		//System.out.println("edit test Method");
		Reporter.log("edit", true);
	}
	@Test
	public void MidifyTest()
	{
		//System.out.println("Modify test Method");
		Reporter.log("Modify", true);
	}
	@Test
	public void deleteTest()
	{
	//	System.out.println("delete Test Method");
		Reporter.log("delate", true);
	}
}
