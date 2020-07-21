package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	     driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
	     Alert al = driver.switchTo().alert();
	     al.accept();
	     driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
	     Alert al1=driver.switchTo().alert();
	     al1.dismiss();
	     driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
	     Alert al2 = driver.switchTo().alert();
	     System.out.println(al2.getText());
	     al2.sendKeys("Neetu");
	     al2.accept();
	     
	}

}
