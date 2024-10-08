package onesample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SuiteExample {
WebDriver driver;
long startTime;
long endTime;
@BeforeSuite
public void launchBrowser() {
	driver = new ChromeDriver();
	startTime = System.currentTimeMillis();
}


@Test
	public void openingChrome(){
	 driver.get("https://www.google.co.in/");
	 
}
	
	
@Test
public void openingBing() {
	driver.get("https://www.bing.co.in/");
	
   }

@Test
public void openingYahoo() {
	driver.get("https://www.Yahoo.co.in/");
	 
}

@AfterSuite
	public void closeBrowser() {
	long endTime = System.currentTimeMillis();
	long totalTime = startTime-endTime;
	System.out.println("Total Time Taken"+totalTime+"ms");
	driver.quit();
	}

	}