package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependentxpath {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     //opening chrome
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//searching
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("amazon");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		
		//clicking on amazon
		driver.findElement(By.xpath("//h3[contains(.,'Amazon.in')]")).click();
		
		//searching samsung mobiles
		driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearch')]")).sendKeys("Samsung mobiles");
		
		//clicking on search icon
		driver.findElement(By.xpath("//input[contains(@value,'Go')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy M31 (Space Black, 6GB RAM, 128GB Storage)'][1]/../../../../../../../../div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[1]")).click();
		
		
	}

}
