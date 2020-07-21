package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
  
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	     driver.get("https://www.google.com");
	     driver.manage().window().maximize();
	     TakesScreenshot sc=(TakesScreenshot) driver;
	     File src = sc.getScreenshotAs(OutputType.FILE);
	     File des=new File("./snapshot/google");
	     FileUtils.copyFile(src,des);
	}

}
