package com.sumon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
 WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.findElement(By.linkText("Droppable")).click();
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));



Actions ac= new Actions(driver);
Thread.sleep(2000);

WebElement  drag= driver.findElement(By.xpath("//div[@id='draggable']"));
Thread.sleep(2000);
WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
 ac.moveToElement(drop).moveToElement(drag).build().perform();














	}

}
