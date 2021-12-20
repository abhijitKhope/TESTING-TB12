package Loginpage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

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
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
		
		
		
	}
	public void loginInfo() throws IOException {
		
		 FileInputStream fi=new FileInputStream("C:\\Users\\abhi\\Desktop\\ABHI\\Xmls\\Sample100.xlsx");
	        XSSFWorkbook book=new XSSFWorkbook(fi);
	        XSSFSheet sheet=book.getSheet("Sheet3");
	        XSSFRow R=sheet.getRow(1);
	        XSSFCell C=R.getCell(0);
	        String fname=C.getStringCellValue();
	        System.out.println(fname);
	        XSSFCell C1=R.getCell(1);
	        String lname=C1.getStringCellValue();
	        System.out.println(lname);
	        XSSFCell c2=R.getCell(2);
	        String phone=c2.getStringCellValue();
	        System.out.println(phone);
	        XSSFCell C2=R.getCell(3);
	        String mail=C2.getStringCellValue();
	        System.out.println(mail);
	        XSSFCell C3=R.getCell(4);
	        String ad=C3.getStringCellValue();
	        System.out.println(ad);
	        XSSFCell C4=R.getCell(5);
	        String cit=C4.getStringCellValue();
	        System.out.println(cit);
	        XSSFCell C5=R.getCell(6);
	        String stat=C5.getStringCellValue();
	        System.out.println(stat);
	        XSSFCell C6=R.getCell(7);
	        String pcode=C6.getStringCellValue();
	        System.out.println(pcode);
	        XSSFCell C7=R.getCell(8);
	        String country1=C7.getStringCellValue();
	        System.out.println(country1);
	        XSSFCell C8=R.getCell(9);
	        String unam=C8.getStringCellValue();
	        System.out.println(unam);
	        XSSFCell C9=R.getCell(10);
	        String pas=C9.getStringCellValue();
	        System.out.println(pas);
	        XSSFCell C10=R.getCell(11);
	        String cpasss=C10.getStringCellValue();
	        System.out.println(cpasss);
	        
	        
	        
	        
	        
	        
	        
	        
	    driver.findElement(name).sendKeys(fname);
		driver.findElement(latname).sendKeys(lname);
		driver.findElement(mn).sendKeys(phone);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(add).sendKeys(ad);
		driver.findElement(city).sendKeys(cit);
		driver.findElement(state).sendKeys(stat);
		driver.findElement(post).sendKeys(pcode);
		
		WebElement web=driver.findElement(contry);
		Select s=new Select(web);
		s.selectByValue(country1);
		driver.findElement(uname).sendKeys(unam);
		driver.findElement(pass).sendKeys(pas);
		driver.findElement(cpass).sendKeys(cpasss);
		driver.findElement(clik).click();
		
		
		
		
		
	}
	


}
