package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TestDemo {
	
  @Test
  public void f() throws IOException 
	{
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	TakesScreenshot ts=(TakesScreenshot)driver;
    File src=ts.getScreenshotAs(OutputType.FILE);
    File des=new File("./snapshot/google1.png");
    FileUtils.copyFile(src, des);
}
}
