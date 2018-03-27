package com.matrix.common;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.matrix.keyword.Keywords;

public class DriverSetup extends Keywords{

	public DriverSetup(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public WebDriver browser_setup(String browser, Platform platfrom,String IP){
		System.out.println("viswanadh");
		
		DesiredCapabilities capability=null;
		
		System.setProperty("webdriver.firefox.marionette","E:\\ViswanadhDCM\\SeleniumLBFiles\\geckodriver.exe");
		
		capability=DesiredCapabilities.firefox();
		
		capability.setBrowserName(browser);
		
		capability.setPlatform(platfrom);
		return driver;
		
	}

}
