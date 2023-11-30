package com.practice.PakageTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllBroken_Lnks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://fssai.gov.in/");
		driver.get("https://www.kerala9.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 
		//find all links present on webpage
		 List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
		 System.out.println(AllLinks.size());
		
		 // create emplty arry to store all broken links
		 ArrayList<String> ArrLinks = new ArrayList<String>();
		
		 //apply for loop to get atrribut name
		 for(int i=0;i<AllLinks.size();i++)
		 {
			 String eachLink = AllLinks.get(i).getAttribute("href");
			 int statuscode =0;
			 try {
				URL url = new URL(eachLink);
				
			HttpsURLConnection	httpurlConn = (HttpsURLConnection)url.openConnection();
			statuscode = httpurlConn.getResponseCode();
			
			if(statuscode>=400)
			{
				ArrLinks.add(eachLink);
				System.out.println(eachLink+"========>"+ statuscode);
			}
			else
			{
				System.out.println(eachLink+"========>"+ statuscode);
			}
			
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
			 
		 
		
		 
		
	
	
	

	}

}
