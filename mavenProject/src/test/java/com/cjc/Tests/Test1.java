package com.cjc.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Loginpage.LoginPage;

public class Test1 {
	
	public WebDriver driver;
	@Test
	
	public void m11() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demo.guru99.com/test/newtours/register.php");
		  driver.manage().window().maximize();
		  LoginPage lg=new LoginPage(driver);
		  lg.loginInfo();
		System.out.println("new update");
		
		
		
		
	}

}
