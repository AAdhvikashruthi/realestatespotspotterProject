package com.TestNG;

import org.testng.annotations.Test;

public class PracticeTestNg2 {
	@Test
	public void createTest()
	{
		System.out.println("create Test");
	}
	@Test(dependsOnMethods = "deleteTest" )
	public void editTest()
	{
		System.out.println("edit Test");
	}
	@Test
	public void deleteTest()
	{
		System.out.println("delete Test");
	}
	@Test
	public void updateTest()
	{
		System.out.println("update Test");
	}
	
	
	
	
}
