package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
//	     driver.get("https://www.craftsvilla.com");
//	     driver.manage().window().maximize();
//	     WebElement element=driver.findElement(By.xpath("(//img[@class='img-responsive mb-view-images feed-img dy-feed'])[1]"));
//	     Point loc = element.getLocation();
//	     int x=loc.x;
//	     int y=loc.y;
//	     JavascriptExecutor js=(JavascriptExecutor) driver;
//	     js.executeScript("scrollBy("+x+","+y+")");
		
		driver.get("https://www.starhealth.in/customerportal/instant-renewal");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy("+200+","+300+")");
}

}
