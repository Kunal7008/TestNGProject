package com.dataprovider.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hover {
	WebDriver driver1;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
		driver1= new ChromeDriver();
		driver1.get("https://facebook.com");
	}
@Test(dataProvider="SearchProvider")
public void testMethod(String username,String password) {
	driver1.findElement(By.name("email")).sendKeys(username);
	driver1.findElement(By.id("pass")).sendKeys(password);
}
@DataProvider(name="SearchProvider")
public Object[][] getDataFromDataProvider(){
	return new Object[][] {
		  { "Guru99", "India" },
          { "Krishna", "UK" },
          { "Bhupesh", "USA" }
	};
}

}
