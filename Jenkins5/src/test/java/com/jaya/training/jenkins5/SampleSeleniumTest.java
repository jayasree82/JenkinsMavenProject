package com.jaya.training.jenkins5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleSeleniumTest {
	
	WebDriver driver;

	@BeforeClass
	public void StartBrowser() {
		System.setProperty("Webdriver.chrome.driver", "E:\\Download\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximised");
		driver = new ChromeDriver(chromeOptions);
		
	}

@Test

public void validateGoogleId() throws Exception{
	System.out.println("Opening Browser");
	driver.get("http://www.google.com");
	System.out.println("Clicking Gmail Link");
	driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div.div[1]/a")).click();
	System.out.println("Clicking Signin Link");
	driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
	System.out.println("Entering username");
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("jaya.training.jenkins5");
	System.out.println("Clicking Next button");
	driver.findElement(By.xpath("//*[@id=\"idendiferNext\"]/content/span")).click();
	Thread.sleep(5000);
	boolean textFound = driver.getPageSource().contains("Forgot Password");
	AssertJUnit.assertTrue(textFound);
		
	
}

@AfterClass

public void closeBrowser() {
	driver.quit();
	
}

}
