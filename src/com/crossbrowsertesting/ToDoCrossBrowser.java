package com.crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToDoCrossBrowser {
	WebDriver driver1;
	@BeforeTest
@Parameters("browser")
public void data(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
		driver1= new ChromeDriver();
		
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\geckodriver.exe");
		driver1= new FirefoxDriver();
}
}
@Test
public void how() throws InterruptedException {
	driver1.get("https://jio.com");
}
}
