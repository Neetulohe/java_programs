package qspEncapsulationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qspEncapsulationPage.OrangeHRM_LoginPage;

public class TestValidLogin_TC01 {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
  driver.get("https://opensource-demo.orangehrmlive.com/");
  Thread.sleep(4000);
  OrangeHRM_LoginPage op=new OrangeHRM_LoginPage(driver);
		  op.credentials("admin","admin123");
  op.login();
	}

}
