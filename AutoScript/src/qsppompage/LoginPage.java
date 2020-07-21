package qsppompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// Declaration 
     @FindBy(id="txtUsername") private WebElement unTB;
     @FindBy(id="txtPassword") private WebElement pwTB;
     @FindBy(id="btnLogin") private WebElement lgin;
     
//     //Initialization
     public LoginPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     //Utilization
     public void credentials(String username, String password)
     {
    	 unTB.sendKeys(username);
    	 pwTB.sendKeys(password);
     }
     public void login()
     {
    	 lgin.click();
     }
}
