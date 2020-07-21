package qspEncapsulationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRM_LoginPage {
	//Declaration
	//Declaring all the webelements variables present on that page
	
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement lgnbtn;
	private WebElement forgotpassword;
	
	//Initialization
	//Initializing all the WebElement which are declared
	public OrangeHRM_LoginPage(WebDriver driver)
	{
		unTB=driver.findElement(By.id("txtUsername"));
		pwTB=driver.findElement(By.id("txtPassword"));
		lgnbtn=driver.findElement(By.id("btnLogin"));
		
	}
	
	//Utilization
	public void credentials(String username,String password)
	{
		unTB.sendKeys(username);
		pwTB.sendKeys(password);
	}
	
	public void login()
	{
		lgnbtn.click();
	}
	
	public void frgtpwd()
	{
		forgotpassword.click();
	}
}
