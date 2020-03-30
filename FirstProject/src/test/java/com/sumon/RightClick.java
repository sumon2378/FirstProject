package com.sumon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.name(""))).perform();
		act.contextClick().perform();
		act.moveToElement(driver.findElement(By.tagName("a"))).perform();
		act.contextClick().perform();
		
		
		// doublie click
		Actions actd = new Actions(driver);
	    actd.doubleClick(driver.findElement(By.linkText("")));// double click
	    
	    
	    
	    //total cheak box
	    
	    
	    List<WebElement> chkBox = driver.findElements(By.xpath("//htmltag[@attbute='checkbox']"));
	    		for(int i=0; i <=chkBox.size(); i++){
	    		chkBox.get(i).click();
	}
	}
}
