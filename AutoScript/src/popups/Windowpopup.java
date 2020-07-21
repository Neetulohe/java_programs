package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowpopup {

	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.google.com");
	     Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_P);
	     r.keyRelease(KeyEvent.VK_CONTROL);
	     r.keyRelease(KeyEvent.VK_P);
	     System.out.println("Done");
	     File f=new File("./data/print.exe");
	     Runtime.getRuntime().exec(f.getAbsolutePath());
	}

}
