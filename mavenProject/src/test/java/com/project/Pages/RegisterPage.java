package com.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
	
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	@FindBy(how=How.XPATH,using="//td[@align=\"right\"]/following-sibling::td/input[@name=\"firstName\"]")
	private WebElement uname;
	
	public void method1() {
		
		uname.sendKeys("abd");
	}

}
