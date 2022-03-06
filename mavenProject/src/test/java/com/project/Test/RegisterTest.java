package com.project.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.project.Pages.RegisterPage;
import com.project.Utility.BaseClass;

public class RegisterTest extends BaseClass{
	
	@BeforeSuite
	public void openBrowser() {
		
		super.openBrowser();
	}
	@Test
	public void Test1() {
		RegisterPage page=PageFactory.initElements(driver,RegisterPage.class);
		
		page.method1();
		
	}

}
