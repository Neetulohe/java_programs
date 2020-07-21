package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	static WebDriver driver;
	@BeforeSuite
	public void info()
	{
		Reporter.log("Thre information is about employee leave and attendance",true);
	}
	
	@BeforeTest
	public void settingproperty()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@BeforeMethod
	public void openingbrowser()
	{
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closingbrowser()
	{
		driver.close();
    }
	@AfterSuite
	public void report()
	{
		Reporter.log("Final Report",true);
	}
}
