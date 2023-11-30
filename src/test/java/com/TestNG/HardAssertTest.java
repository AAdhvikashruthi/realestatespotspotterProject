package com.TestNG;

import static org.junit.Assert.assertNull;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertTest {
	@Test
	public void hardAssertTest_1()
	{
		String exp ="A";
		System.out.println("Ts-----1");
		assertEquals("A",exp,"A is not fount");
		System.out.println("Ts-----2");
		System.out.println("Ts-----3");
		
	}
	
	@Test
	public void hardAssertTest_2()
	{
		String exp ="A";
		System.out.println("Ts-----4");
		


		assertEquals("B",exp,"A is not fount");
		System.out.println("Ts-----5");
		System.out.println("Ts-----6");
		
	}
	@Test
	public void hardAssertTest_3()
	{
		int a=50;
		System.out.println("Ts-----7");
		assertNotNull(a);
		System.out.println("Ts-----8");
		System.out.println("Ts-----9");
		
	}
	@Test
	public void hardAssertTest_4()
	{
		int a=50;
		System.out.println("Ts-----7");
		assertNull(a);
		System.out.println("Ts-----8");
		
		
	}
	@Test
	public void soft()
	{
		String exp="Application";
		SoftAssert s = new SoftAssert();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://rmgtestingserver/domain/House_Rental_Application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String title = driver.getTitle();
		s.assertEquals(title, exp);
		System.out.println(title);
		s.assertAll();
		
	}

}
