package com.matrix.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.matrix.common.ReadfromProperties;

public class Keywords {
	
	
	//testname
	
	public static String testName;
	
	public static String stepName;
	
	public static WebDriver driver=null;
	
	ReadfromProperties pro=new ReadfromProperties();
	
	public Keywords(WebDriver driver){
		
		this.driver=driver;
		}

public void type(By object,String data){
	
	driver.findElement(object).sendKeys(data);
	
}


public void click(WebElement element){
	
	element.click();
}
}
