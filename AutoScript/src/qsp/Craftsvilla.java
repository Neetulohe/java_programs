package qsp;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Craftsvilla {
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	     // opening the chrome browser
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			//opening craftsvilla
			driver.get("https://www.google.com");
			
			//searching craftsvilla
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Craftsvilla");
			
			//clicking search icon
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
			
			//clicking on the link of craftsvilla
			driver.findElement(By.xpath("//h3[text()='Craftsvilla']")).click();
			
			//wait for 4 seconds
			Thread.sleep(4000);
			
			//clicking on sarees
			driver.findElement(By.xpath("//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")).click();
			
			//clicking on first image
			driver.findElement(By.cssSelector("a[href^='/shop/craftsvilla-black-color-georgette-'] ")).click();
	        
			Thread.sleep(2000);
			//clicking on add to cart
			driver.findElement(By.xpath("//button[@class='btn btn-addtocart addtocart_desktop']")).click();
			
			Thread.sleep(4000);
			//removinf the item
			driver.findElement(By.xpath("//span[@id='open-remove-item-modal']")).click();
			
			//handling pop up
			driver.findElement(By.xpath("//button[@id='remove-item-btn']")).click();
			
			//closing the browser
			driver.close();
		}

	}


