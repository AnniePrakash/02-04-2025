package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestCaseOne extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BrowserLaunch("chrome");
		loadUrl("https://www.facebook.com/");
		maximize();
		
		findElement("id","email").sendKeys("Hanno@1234");
		screenShot("C:\\new7pmbatch\\selenium\\java\\manual\\base.png");
		
		
	}

}
