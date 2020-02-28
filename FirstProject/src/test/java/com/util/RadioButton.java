package com.util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);


WebElement custom=driver.findElement(By.xpath("//input[@id='u_0_9']"));


custom.click();


boolean a =custom.isSelected();
System.out.println(a);


boolean b =custom.isEnabled();
System.out.println(b);

boolean c= custom.isDisplayed();
System.out.println(c);



ScreenShot.Shot(driver, "Radio Button");

//driver.quit();


	}
}
