package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_Page_Dataprovider {
   
        //Declaration
	
	@FindBy (id="txtUsername") private WebElement unTB;
	@FindBy (id="txtPassword") private WebElement pwTB;
	@FindBy (id="btnLogin") private WebElement lgn;
	
	//Initialization
	public Login_Page_Dataprovider(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	//Utilization
	public void credentials(String username,String password)
	{
		unTB.sendKeys(username);
		pwTB.sendKeys(password);
	}
	
	public void login()
	{
		lgn.click();
	}
}
