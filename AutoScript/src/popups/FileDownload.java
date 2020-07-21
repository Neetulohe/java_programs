package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.selenium.dev/downloads/");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElement(By.linkText("3.141.59")).click();
	     Robot rt=new Robot();
	     rt.keyPress(KeyEvent.VK_LEFT);
	     rt.keyRelease(KeyEvent.VK_LEFT);
	     rt.keyPress(KeyEvent.VK_ENTER);
	     
	     

	}

}
