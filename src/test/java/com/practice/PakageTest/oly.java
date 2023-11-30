package com.practice.PakageTest;


	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class oly {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		String countryname = "Brazil";
		List<WebElement> cname = driver.findElements(By.xpath("//span[@class=\"styles__CountryName-sc-fehzzg-6 jYXabZ\"]"));
		List<WebElement> gold = driver.findElements(By.xpath("//div[@title='Gold']"));
		List<WebElement> silver = driver.findElements(By.xpath("//div[@title=\"Silver\"]"));
		for(int i=0;i<cname.size();i++)
		{
			String cname1 = cname.get(i).getText();
			String gold1 = gold.get(i).getText();
			String silver1 = silver.get(i).getText();
			if(countryname.equals(cname1))
			{
			System.out.println(cname1+"----->"+gold1+"----->"+silver1);
			}
		}
		

}
	}
