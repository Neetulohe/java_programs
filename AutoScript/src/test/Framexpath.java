package test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Framexpath {
        //Declaration
	  @FindBy (id="eid") WebElement empid;
	  @FindBy (id="ename") WebElement ename;
	  @FindBy (linkText="Search") WebElement search;
	  
	  @FindBy (id="pfno") WebElement pfno;
	  @FindBy (linkText="Search") WebElement srch;
	  
	  //Initialization
	  public Framexpath(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  //utilization
	  public void attendancetracking(String id,String name)
	  {
		  empid.sendKeys(id);
		  ename.sendKeys(name);
		  search.click(); 
	  }
	  public void provident(String number)
	  {  
		  pfno.sendKeys(number);
		  srch.click();
	  }
}
