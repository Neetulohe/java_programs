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

public class BaseClassDataProvider {

	public static WebDriver driver;
	@BeforeSuite
	public void heading()
	{
		Reporter.log("This is explaination of login page",true);
	}
	@BeforeTest
	public void settingpro()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@BeforeMethod
	public void openbrowser()
	{
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	@AfterSuite
	public void report()
	{
		Reporter.log("report",true);
	}
  }
