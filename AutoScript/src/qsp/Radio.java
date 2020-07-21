package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get("file:///C:/Users/A148512/Desktop/radio.html");
	     List<WebElement> element = driver.findElements(By.xpath("//input[@name='gender']"));
	     for(WebElement we:element)
	     {
	    	 we.click();
	    	 Thread.sleep(1000);
	     }
	     driver.close();
	}

}
