package popups;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("file:///C:/Users/A148512/Desktop/radio.html");
	     File f=new File("./data/resume.rtf");
	     String path = f.getAbsolutePath();
	     WebElement element=driver.findElement(By.xpath("//input[@name='n1']"));
	     element.sendKeys(path);
	}

}
