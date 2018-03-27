package com.matrix.sanity;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.matrix.common.DriverSetup;
import com.matrix.common.ReadfromProperties;
import com.matrix.keyword.Keywords;
import com.matrix.ui.LoginPage;

public class Testlogin {
	
	private WebDriver driver=null;
	
	private LoginPage loginpage=null;
	

	ReadfromProperties pro=new ReadfromProperties();
	 
@BeforeMethod
@Parameters({"browser","platfor","IP"})

public void setup(String browser,Platform platfor,String IP){
	
	DriverSetup driverstep=new DriverSetup(driver);
	
	driver=driverstep.browser_setup(browser,platfor,IP);
	
	loginpage=new LoginPage(driver);
	
	
			}

@Test(dataProvider="Login_Valid_Credential",description="Login into eServices with valid credential")
public void loginvaliddata(String url,String username, String password,String method){
	System.out.println("Login with valid credentials.....");
	Keywords.testName="LoginData";
	driver.get(url);

	driver.manage().window().maximize();
	
	
}
}
