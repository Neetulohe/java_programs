import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
//		WebDriver driver= new ChromeDriver();
//		   driver.manage().window().maximize();
//		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//			WebElement pwTB = driver.findElement(By.id("txtPassword"));
//			WebElement lgnbtn = driver.findElement(By.id("btnLogin"));
			
            FileInputStream fis=new FileInputStream("./data/Demo.xlsx");
            Workbook wb=WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheet("valid");
           Row row = sheet.createRow(2);
           Cell cell = row.createCell(0);
           cell.setCellValue("dummy");
           FileOutputStream fos=new FileOutputStream("./data/Demo.xlsx");
           wb.write(fos);
           wb.close();
           fos.close();
//            Row row = sheet.getRow(1);
//            Cell cell = row.getCell(0);
//            WebElement unTB = driver.findElement(By.id("txtUsername"));
//            unTB.sendKeys(cell.toString());
//            String password = sheet.getRow(1).getCell(1).toString();
//            pwTB.sendKeys(password);
//            lgnbtn.click();
            
	}

}
