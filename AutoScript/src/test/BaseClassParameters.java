package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClassParameters {
  public static WebDriver driver;

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("This is parameters annotation practice",true);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("report",true);
}

}
