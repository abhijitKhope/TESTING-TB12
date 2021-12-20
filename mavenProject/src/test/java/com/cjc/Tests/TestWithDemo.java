package com.cjc.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestWithDemo {
	WebDriver driver;

	
	
	
  @Test(priority=2)
  public void f() {
	  System.out.println("test method");
	  
	  
  }
  @Test(priority=1)
  public void m1() {
	  System.out.println("test method Second");
	  driver.findElement(By.partialLinkText("Create ")).click();
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before test method");
  }

  @AfterMethod
  public void afterMethod() throws IOException {
	  
	  System.out.println("after the method");
	  
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyToDirectory(src, new File("C:\\Users\\abhi\\Desktop\\ABHI\\images\\Demo.png"));
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  Set<Cookie>cook=driver.manage().getCookies();
	  
	  for(Cookie ck:cook) {
		 String s= ck.getName();
		 System.out.println("all the cookies name:"+s);
		 
		 
		  
		  
	  }
  }

  @BeforeTest
  public void beforeTest() {
	  driver.get("https://www.flipkart.com/");
	  
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	 
  }

  @AfterSuite
  public void afterSuite() {
	  
	  //driver.close();
  }

}
