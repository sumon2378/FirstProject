package com.sumon;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenlLinl { 
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		for (int i=0; i<linklist.size();i++) {
			WebElement element= linklist.get(i);
			String url=element.getAttribute("herf");
			verifilink(url);
				
		}}
		
		public static void verifilink(String urllink)    {
			try {
			
			URL url= new URL(urllink);
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			
			con.setConnectTimeout(2000);
			con.connect();
			
			
			
			if (con.getResponseCode()==200) {
				
				System.out.println(urllink+"-" +con.getResponseMessage());
				
			}
	if (con.getResponseCode()==404) {
				
				System.out.println(urllink+"-" +con.getResponseMessage());
				
			}
			
			
		
		}
			catch (Exception e) {
				
			}
	}
	
				

		
		
		
	}


	
	