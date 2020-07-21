package qspActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get("file:///C:/Users/A148512/Desktop/DND.html");
	     WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	     WebElement drop = driver.findElement(By.xpath("//p[text()='Drop here']"));
	     Actions act=new Actions(driver);
	     act.dragAndDrop(drag, drop).perform();
	}

}
