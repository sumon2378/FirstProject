package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	
	public static void Shot(WebDriver driver, String ss) throws IOException {
			TakesScreenshot ts =(TakesScreenshot)driver;
		   File f=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(ss+".png"));
			
	//public static void demoShot(WebDriver driver2, String ss2) {
		
		//TakesScreenshot td= (TakesScreenshot)driver2;
		//File f=td.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(f, new File(ss+".png"));
		
		
	
	
	//public static void Shot(WebDriver driver , String dd) {
		
		//TakesScreenshot ts=(TakesScreenshot)driver;
		
		
		//File f=ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(f, new File(dd+".png"));
		
		
		
		
		//public static void Shot(WebDriver driver , String ff) {
		
		//TakesScreenshot ts= (TakesScreenshot)driver;
		//File f=ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(f, new File(ff
			//	+".png"));
		
		
	}
	
	
	
	
	
}

	
	
	
	
	

