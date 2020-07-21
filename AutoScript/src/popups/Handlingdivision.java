package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdivision {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	     driver.get("https://www.spicejet.com");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     JavascriptExecutor js=(JavascriptExecutor) driver;
	     WebElement calender = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
	     js.executeScript("arguments[0].setAttribute('text()','Thu, Jun 10 2021');", calender);
	}

}
