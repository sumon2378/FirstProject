package com.sumon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HttpHandel {

	public static void main(String[] args) {
		
		
		FirefoxProfile fp= new FirefoxProfile ();
		fp.setAcceptUntrustedCertificates(false);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		
		
		
		//http://username:password@url
		//http://creyate:jamesbond007@alpha.creyate.com
			
			
	}

}


