package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser {
	static
	   {
		   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   }
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("scrollBy("+200+","+300+")");
	    driver.findElement(By.xpath("//span[text()='Refrigerators']")).click();
	    js.executeScript("scrollBy("+300+","+300+")");
         String price = driver.findElement(By.xpath("//span[text()='Haier 181 L 2 Star Direct-Cool Single Door Refrigerator (HED-1812BKS-E, Black Brushline)']/ancestor::div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 sg-col sg-col-28-of-36 sg-col-20-of-28']/descendant::span[@class='a-price-whole']")).getText();
		System.out.println(price);
		}
}
