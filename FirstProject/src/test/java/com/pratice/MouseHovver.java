package com.pratice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.util.ScreenShot;

public class MouseHovver {
	
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	Actions ac  = new Actions(driver);
	
	
	Thread.sleep(20000);
	WebElement mmaillist = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	
	
	Thread.sleep(20000);
	
	WebElement takelist = driver.findElement(By.xpath("//span[contains(text(),'Baby Registry')]"));
	
	ac.moveToElement(mmaillist).moveToElement(takelist).click().build().perform();
	
	
	ScreenShot.Shot(driver, "Baby Registry");
}
}