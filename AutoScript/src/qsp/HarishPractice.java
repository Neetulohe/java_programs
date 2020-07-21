package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HarishPractice {
	 static
	    {
	    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/A148512/Desktop/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		System.out.println(element.getAttribute("class"));
//		Point loc = element.getLocation();
//		System.out.println(loc);
//		int x = loc.getX();
//		int y = loc.getY();
//		System.out.println(x);
//		System.out.println(y);
//		Rectangle rect = element.getRect();
//		System.out.println(rect);
//		int height = rect.getHeight();
//		int width = rect.getWidth();
//		System.out.println(height);
//		System.out.println(width);
//		Dimension size = element.getSize();
//		System.out.println(size);
//		int ht = size.getHeight();
//		int wd = size.getWidth();
//		System.out.println(ht);
//		System.out.println(wd);
//		WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
//		String tag = gmail.getTagName();
//		if(tag.equals("a"))
//				{
//         System.out.println("this ia a link");			
//				}
//		
//		WebElement log = driver.findElement(By.xpath("(//div[contains(@class,'eGOV')])[2]"));
//		
//		System.out.println(log.isEnabled());
//		driver.close();
		WebElement radio = driver.findElement(By.id("i1"));
		System.out.println(radio.isSelected());
		
	}

}
