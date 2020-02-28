package com.common;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



	

public class CrossBrowser {
	
	WebDriver driver;

@Parameters("browser")
	@Test
	public void getBrowser(String BrowserName ) {
	if (BrowserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	
	else if (BrowserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko..driver", "./Browser/geckodriver.exe");
		driver=new FirefoxDriver();
		}
	
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
	Actions ac= new Actions(driver);	
	

	WebElement accountList=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	
		
		WebElement weddingList=driver.findElement(By.xpath("//span[contains(text(),'Baby Registry')]"));
		
	
		ac.moveToElement(accountList).moveToElement(weddingList).click().build().perform();
		


	}
	
	

}
