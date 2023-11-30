package com.TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class checkOrderOfExecution {
	
	@BeforeSuite
	public void config_BS()
	{
		System.out.println("@BeforeSuite");
	}
	
	@BeforeClass
	public void config_BC()
	{
		System.out.println("@BeforeClass");
	}

	@BeforeClass
	public void config1_BC()
	{
		System.out.println("@BeforeClass");
	}
	
	@Test
	public void testscript()
	{
		System.out.println("@Test");
	}
	@BeforeMethod
	public void config_BM()
	{
		System.out.println("@BeforeMethod");
	}
	@AfterMethod
	public void config_AM()
	{
		System.out.println("@AfterMethod");
	}
	@AfterClass
	public void config_AC()
	{
		System.out.println("@AfterClass");
	}
	
	@Test
	public void testscript1()
	{
		System.out.println("@Test");
	}
	@BeforeMethod
	public void config2_BM()
	{
		System.out.println("@BeforeMethod");
	}
	@AfterClass
	public void config2_AC()
	{
		System.out.println("@AfterClass");
	}
	@BeforeMethod
	public void config3_BM()
	{
		System.out.println("@BeforeMethod");
	}
	@AfterMethod
	public void config2_AM()
	{
		System.out.println("@AfterMethod");
	}
	@AfterSuite
	public void config_AS()
	{
		System.out.println("@AfterSuite");
	}
	
}
