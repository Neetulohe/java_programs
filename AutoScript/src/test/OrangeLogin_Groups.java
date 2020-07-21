package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLogin_Groups {
	//Declaration
		@FindBy (id="txtUsername") private WebElement user;
		@FindBy (id="txtPassword") private WebElement pass;
		@FindBy (id="btnLogin") private WebElement log;

	//Initialization
	 

	 public OrangeLogin_Groups(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(driver, this);
	}



	//Utilization
	 public void credential(String username, String password)
	 {
		 user.sendKeys(username);
		 pass.sendKeys(password);
	 }
	 public void login()
	 {
		 log.click();
	 }
	 
}
