package com.cjc.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Loginpage.Login;

public class Tests {
	WebDriver driver;
	@Test
	public void Testt() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/register.php");
	  driver.manage().window().maximize();
	  Login lg=new Login(driver);
	  lg.loginInfo();

}
}
