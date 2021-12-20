package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login {
	
	WebDriver driver;
	By name=By.cssSelector("[name=\"firstName\"]");
	By latname=By.cssSelector("[name=\"lastName\"]");
	By mn=By.cssSelector("[name=\"phone\"]");
	By email=By.cssSelector("[id=\"userName\"]");
	By add=By.cssSelector("[name=\"address1\"]");
	By city=By.cssSelector("[name=\"city\"]");
	By state=By.cssSelector("[name=\"state\"]");
	By post=By.cssSelector("[name=\"postalCode\"]");
	By contry=By.cssSelector("[name=\"country\"]");
	By uname=By.cssSelector("[id=\"email\"]");
	By pass=By.cssSelector("[name=\"password\"]");
	By cpass=By.cssSelector("[name=\"confirmPassword\"]");
	By clik=By.cssSelector("[name=\"submit\"]");
	
	public Login(WebDriver driver) {
		
		this.driver=driver;
		
		
		
		
	}
	public void loginInfo() {
		
		
		driver.findElement(name).sendKeys("plkmn");
		driver.findElement(latname).sendKeys("mmpqw");
		driver.findElement(mn).sendKeys("123456");
		driver.findElement(email).sendKeys("abcd123@gmail.com");
		driver.findElement(add).sendKeys("pune");
		driver.findElement(city).sendKeys("pune");
		driver.findElement(state).sendKeys("mh");
		driver.findElement(post).sendKeys("444101");
		
		WebElement web=driver.findElement(contry);
		Select s=new Select(web);
		s.selectByValue("INDIA");
		driver.findElement(uname).sendKeys("pqrst");
		driver.findElement(pass).sendKeys("123456");
		driver.findElement(cpass).sendKeys("123456");
		driver.findElement(clik).click();
		
		
		
		
		
	}
	

}
