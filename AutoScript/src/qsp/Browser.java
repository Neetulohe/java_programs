package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
	    driver.get("http://www.google.com");
	    driver.manage().window().maximize();
//	    System.out.println(driver.getTitle());
//	    System.out.println(driver.getPageSource());
//	    System.out.println(driver.getCurrentUrl());
//	    driver.quit();
//
//	    WebDriver driver1 = new ChromeDriver();
//	    Thread.sleep(4000);
//	    driver1.navigate().to("http://www.naukri.com");
//	    driver1.close();

         driver.findElement(By.partialLinkText("How Search works")).click();
        driver.navigate().back();
	    driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("India Monuments");
	    driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.cssSelector("a[title='India Gate']")).click();
	    driver.findElement(By.cssSelector("a[href='https://en.wikipedia.org/wiki/India_Gate']")).click();
	    driver.findElement(By.cssSelector("a[title='Past revisions of this page [alt-shift-h]']")).click();
	    driver.findElement(By.cssSelector("a[title='User:HJ Mitchell']")).click();
	    driver.findElement(By.cssSelector("a[title='Find background information on current events']")).click();
	    driver.findElement(By.linkText("Sports events")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("a[title='Visit a randomly selected article [alt-shift-x]']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("a[title='Discuss improvements to the content page [alt-shift-t]']")).click();
	    driver.findElement(By.cssSelector("a[class='mw-wiki-logo']")).click();
	   
	    // Shortcuts of cssSelector
	    driver.findElement(By.cssSelector("a[title$='Arts']")).click();
	    driver.findElement(By.cssSelector("img[alt*='Lisa']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("a[class^='mw-mmv-stripe-button']")).click();
	   
		}
}
