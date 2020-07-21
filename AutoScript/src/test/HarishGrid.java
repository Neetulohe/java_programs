package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HarishGrid {
 
	  WebDriver driver;
	  String baseURL,nodeURL;
	  
	  @BeforeTest
	  public void setup() throws MalformedURLException
	  {
		  baseURL="http://newtours.demoaut.com/";
		  nodeURL="http://192.168.1.102:29975/wd/hub";
          DesiredCapabilities cap=DesiredCapabilities.chrome();
          cap.setBrowserName("chrome");
          driver=new RemoteWebDriver(new URL(nodeURL),cap);
	  }
	  
	  @AfterTest
	  public void afterTest()
	  {
		  driver.quit();
	  }
	  @Test
	  public void simple()
	  {
		  driver.get(baseURL);
	  }
  }

