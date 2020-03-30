package com.sumon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighligtLext {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		String color = driver.findElement(By.xpath("//a[text()='Shop']")).getCssValue("color");
		String backcolor = driver.findElement(By.xpath("//a[text()='Shop']")).getCssValue("background-color");
		System.out.println(color);
		System.out.println(backcolor);
		
		
		
		driver.findElement(By.xpath("")).getSize().getWidth();
		driver.findElement(By.xpath("")).getSize().getHeight();
	}

}
