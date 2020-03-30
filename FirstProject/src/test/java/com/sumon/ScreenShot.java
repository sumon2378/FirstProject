package com.sumon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	

	
	
	public static void Shot( WebDriver driver, String b) throws IOException {
	
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(b+".png"));
		
		
	}
}
