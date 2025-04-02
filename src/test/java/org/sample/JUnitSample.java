package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitSample {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void tc05() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();

	}
	
	@AfterClass
	public static void tc03() {
		
		driver.quit();
	

	}
	
	@Test
	public void tc02() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("Hanno@123");
		driver.findElement(By.id("pass")).sendKeys("1234568");
		
		Thread.sleep(3000);

	}

	
	@Before
	public void tc04() {
		driver.get("https://www.facebook.com/");

	}
	
	@After
	public void tc01() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target=new File("C:\\new7pmbatch\\selenium\\java\\junitscreenshot1.png");
		
		FileUtils.copyFile(source, target);
		
		

	}

}
