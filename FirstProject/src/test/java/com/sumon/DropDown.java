package com.sumon;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		List<WebElement>l2=driver.findElements(By.tagName("a"));
		System.err.println(l2.size());
		
		List<WebElement>l3= driver.findElements(By.tagName("iframe"));
		System.err.println(l3.size());
		
		
		
		Select s= new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		s.deselectByVisibleText("Boys");
        
		List<WebElement>l=s.getOptions();
		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i).getText());	
		}
		
		
		ScreenShot.Shot(driver, "Boys");
		driver.quit();

	}

}
