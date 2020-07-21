package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demogrid {
  @Test
  @Parameters({"urlnode","browser"})
  public void f(String urlnode,String browser) throws MalformedURLException {
	  URL url =new URL(urlnode);
	  DesiredCapabilities dc= new DesiredCapabilities();
	  dc.setBrowserName(browser);
	  WebDriver driver=new RemoteWebDriver(url,dc);
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com");
	 WebElement var = driver.switchTo().activeElement();
	 var.sendKeys("selenium");
	 var.sendKeys(Keys.ENTER);
	  
  }
}
