package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    //opening browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//opening google
		driver.get("https://www.google.com");
		
		// 1)FACEBOOK
		//opening facebook
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("facebook");
		
		//Enter
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		//opening facebook
		driver.findElement(By.xpath("//h3[text()='Facebook - Log In or Sign Up']")).click();
		
		//email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dummy@go.in");
		
		//password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("121212");
		
		//login button
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		
		Thread.sleep(2000);
		//2) INSTAGRAM
		//opening new tab
		driver.get("https:www.google.com");
		
		//searching and clicking the instagram
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("instagram");
		
		//Enter
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		//clicking on the link
		driver.findElement(By.xpath("//a[@href='https://www.instagram.com/?hl=en']")).click();
		
		Thread.sleep(3000);
		//username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dummy");
		
		//password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("121212");
		
		//login
		driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
		
		//3) TWITTER
		//opening new tab
		driver.get("https:www.google.com");
				
		//searching and clicking the instagram
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("twitter");
        
		//Enter
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
        
        //click on twitter
        driver.findElement(By.xpath("//h3[text()='Login on Twitter']")).click();
        
        //username
        driver.findElement(By.xpath("//input[@autocapitalize='none'][@name='session[username_or_email]']")).sendKeys("dummy");
        
        //password
        driver.findElement(By.xpath("//input[@autocapitalize='none'][@name='session[password]']")).sendKeys("121212");
        
        //login
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        
        //4) Netflix
          //opening new tab
      		driver.get("https:www.google.com");
      				
      		//searching and clicking the netflix
              driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("netflix");
              
      		//Enter
              driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
              
              //click on netflix
              driver.findElement(By.xpath("//h3[text()='Netflix - Watch TV Shows Online, Watch Movies Online']")).click();
              
              Thread.sleep(5000);
              //click on sign in
              driver.findElement(By.xpath("//a[text()='Sign In']")).click();
              
              //username
              Thread.sleep(3000);
              driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("dummy");
                            
              //password
              driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("121212");
              
              //login
              driver.findElement(By.xpath("//button[text()='Sign In']")).click();
              
            //5) primevideo
              //opening new tab
          		driver.get("https:www.google.com");
          				
          		//searching and clicking the netflix
                  driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("primevideo");
                  
          		//Enter
                  driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
                  
                  //click on primevideo
                  driver.findElement(By.xpath("//a[@id='vn1s0p1c0']")).click();
                  
                  Thread.sleep(5000);
                  //click on sign in
                  driver.findElement(By.xpath("//a[text()='Sign In'][@id='pv-nav-sign-in'][1]")).click();
                  
                  //username
                  Thread.sleep(3000);
                  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("dummy");
                        
                  Thread.sleep(2000);
                  //password
                  driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("121212");
                  
                  //login
                  driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
              
	}

}
