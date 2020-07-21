package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinsuggestions {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get("http://www.google.com");
	   driver.switchTo().activeElement().sendKeys("Selenium");
	   List<WebElement> element = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	   for(int i=0;i<element.size();i++)
	   {
		   System.out.println(element.get(i).getText());
	   }
	   element.get(5).click();
	    driver.close();
	}

}
