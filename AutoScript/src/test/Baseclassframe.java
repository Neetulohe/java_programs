package test;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Baseclassframe {
 
	static WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("file:///C:/Users/A148512/Desktop/Attendance%20tracking.html");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("This is practice of frame",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("Report",true);
  }

}
