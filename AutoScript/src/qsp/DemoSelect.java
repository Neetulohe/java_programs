package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelect {
    
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.google.com");
     driver.manage().window().maximize();
//     driver.findElement(By.tagName("a")).click();
    driver.findElement(By.name("q")).click();   
    driver.switchTo().activeElement().click();
    driver.findElement(By.className("SDkEP")).click();
//    driver.findElement(By.partialLinkText("Gm")).click();
    driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("google");
    driver.findElement(By.cssSelector("input[class*='gLF']")).clear();
    

	}

}
