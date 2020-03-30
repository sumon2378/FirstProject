package com.sumon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		Actions ac= new Actions(driver);
		
		Thread.sleep(2000);
		WebElement mainlist= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Thread.sleep(2000);
		WebElement localList= driver.findElement(By.xpath("//span[contains(text(),'Baby Registry')]"));
		
		
		ac.moveToElement(mainlist).moveToElement(localList).click().build().perform();
		
		
	}

}
