package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Console {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://test-st-wl-envoy.aw.atos.net/WorldlineSTConsole/");
	     driver.findElement(By.xpath("//input[@id='LogonId']")).sendKeys("Asnow");
	     driver.findElement(By.xpath("//input[@id='LoginPasscode']")).sendKeys("Cayman5!");
	     driver.findElement(By.xpath("//button[text()='Login']")).click();
	     WebElement element1=driver.findElement(By.xpath("(//i[@class='icon-globe'])[1]"));
	     WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element1));
		element1.click();
	     driver.findElement(By.xpath("//i[@class='fa fa-globe']")).click();
	     List<WebElement> element = driver.findElements(By.xpath("//input[@type='checkbox']"));
	     WebDriverWait wait1=new WebDriverWait(driver,20);
			wait1.until(ExpectedConditions.visibilityOfAllElements(element));
	     for(int i=0;i<element.size();i++)
	     {
	    	 System.out.println(element.get(i));
	     }
	}

}
