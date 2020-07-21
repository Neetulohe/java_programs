package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
   ChromeDriver driver=new ChromeDriver();
   System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
   FirefoxDriver driver1=new FirefoxDriver();
	}

}
