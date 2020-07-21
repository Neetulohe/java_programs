package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WritinginXL {
  @Test
  public void f() throws EncryptedDocumentException, IOException {
	  Workbook wk=WorkbookFactory.create(new FileInputStream("./data/Demo.xlsx"));
	  Sheet sh = wk.getSheet("invalid");
	  Row r = sh.createRow(5);
	  Cell c = r.createCell(1);
	  c.setCellValue("gocoronago");
	  FileOutputStream fos=new FileOutputStream("./data/Demo.xlsx");
	  wk.write(fos);
	  fos.close();
	 
  }
}
