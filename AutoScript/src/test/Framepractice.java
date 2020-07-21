package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Framepractice extends Baseclassframe{
  @Test
  public void f() {
	Framexpath fx=new Framexpath(driver);
	fx.attendancetracking("234", "Neetu");
	driver.switchTo().frame(0);
	fx.provident("872634387628");
//	  driver.findElement(By.id("eid")).sendKeys("38746");
//	  driver.findElement(By.id("ename")).sendKeys("38746");
//	  
//	  driver.switchTo().frame(0);
//	  driver.findElement(By.id("pfno")).sendKeys("7456783");
//	  WebDriver driver = new ChromeDriver(); //navigates to the Browser
//	    driver.get("file:///C:/Users/A148512/Desktop/Attendance%20tracking.html"); 
//	       // navigates to the page consisting an iframe
//
//	       driver.manage().window().maximize();
//	       driver.switchTo().frame(0); //switching the frame by ID
//
//			System.out.println("********We are switch to the iframe*******");
//   		driver.findElement(By.id("pfno")).sendKeys("7576567");;
//		    //Clicks the iframe
//     
//			System.out.println("*********We are done***************");
//	  
  }
  
}
