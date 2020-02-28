package com.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practic {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("sumonbd64ss@gmail.com");
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumonbd64ss@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sheik1765");
		driver.findElement(By.xpath("//input[@id='u_0_4']")).submit();
	
	}	
	
}

