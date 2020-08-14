package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlingcalendar {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		
		String month1 = "December";
		String year="2020";
		String date="24";

		// *[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[1]/td[3]/a
		// *[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[1]/td[2]
		// *[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[5]/td[1]/a
        Thread.sleep(3000);
//		String xpath1 = "//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[";
//		String xpath2 = "]/td[";
		Thread.sleep(2000);
		WebElement rows = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table"));
		
		System.out.println(rows.getText());
		List<WebElement> rownum = rows.findElements(By.tagName("tr"));
		
		System.out.println(rownum.size());
//		WebElement month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
//		String monthText = month.getText();
		for(int i=1;i<=rownum.size();i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equals(month1) 
						&& driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().equals(year))
				{
					WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[" + i + "]/td[" + j + "]"));
							if(day.getText().equals(date))
								day.click();
							break;
				}
				else
					driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
	}
}
