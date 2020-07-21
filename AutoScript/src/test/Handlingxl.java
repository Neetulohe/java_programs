package test;

import java.io.File;
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
import org.testng.Reporter;
import org.testng.annotations.Test;

import qsppompage.LoginPage;

public class Handlingxl extends Baseclass{
  @Test(enabled=false)
  public void f() throws EncryptedDocumentException, IOException, InterruptedException {
	  LoginPage lp=new LoginPage(driver);
	  FileInputStream fis= new FileInputStream("./data/Demo.xlsx");
	 Workbook wk = WorkbookFactory.create(fis);
	  Sheet sh = wk.getSheet("valid");
	  Row r = sh.getRow(1);
	 String username = r.getCell(0).toString();
	 String password=r.getCell(1).toString();
	 lp.credentials(username, password);
	  lp.login();
	  Thread.sleep(3000);
	  
  }
  @Test(enabled=false)
  public void g() throws IOException, InterruptedException
  {
	  Workbook wk=WorkbookFactory.create(new File("./data/Demo.xlsx"));
	  Sheet sh = wk.getSheet("invalid");
	  LoginPage lp=new LoginPage(driver);
	  for(int i=1;i<sh.getLastRowNum();i++)
	  {
		  String username = sh.getRow(i).getCell(0).toString();
		  String password=sh.getRow(i).getCell(1).toString();
		  lp.credentials(username, password);
		  lp.login();
		  Thread.sleep(2000);
	  }  
  }

}
