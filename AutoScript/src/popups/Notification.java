package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

	     
	   
	   
	      ChromeOptions options=new ChromeOptions();
	      options.addArguments("--disable-notifications");
	      WebDriver driver=new ChromeDriver(options);
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      driver.get("https://www.bigbazaar.com/");

	}

}
