package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framepractice {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://demo.guru99.com/test/guru99home/");
   Thread.sleep(4000);
   WebElement element = driver.findElement(By.xpath("//iframe[@src='ads.html']"));
   driver.switchTo().frame(element);
   System.out.println("We ar switched to frame");
   driver.switchTo().defaultContent();
   driver.findElement(By.xpath("(//a[@class='item'])[1]")).click();
   driver.navigate().back();
   Thread.sleep(4000);
   driver.switchTo().frame(2);
   driver.switchTo().parentFrame();
   driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
   
	}

}
