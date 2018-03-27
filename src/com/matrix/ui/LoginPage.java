package com.matrix.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.matrix.common.ReadfromProperties;
import com.matrix.keyword.Keywords;

public class LoginPage extends Keywords {

	ReadfromProperties prop=new ReadfromProperties();
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

public void typeusername(String username) throws Exception{
	stepName="typeusername";
	type(By.id(prop.getorproperties("Login_matrixuat_username_id")),username);
	
	
}
	


		
	}
	

