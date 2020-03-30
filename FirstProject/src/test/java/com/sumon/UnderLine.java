package com.sumon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UnderLine {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/?gfe_rd=ctrl&amp;ei=bXAwU8jYN4W6iAf8zIDgDA&amp;gws_rd=cr");
	String cssValue= driver.findElement(By.xpath("//a[text()='Hindi']")).getCssValue("text-decoration");
	System.out.println("value"+cssValue);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[text()='Hindi']"))).perform();
	String cssValue1= driver.findElement(By.xpath("//a[text()='Hindi']")).getCssValue("text-decoration");
	System.out.println("value over"+cssValue1);
	driver.close();
	}
	}
