package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HandlingProperties extends Baseclass{
  @Test
  public void f() throws IOException {
	  FileInputStream fis=new FileInputStream("./data/keys.properties");
	  Properties pro=new Properties();
	  pro.load(fis);
	  String username=pro.getProperty("username");
	  String password=pro.getProperty("password");
	  OrangeLogin_Groups org=new OrangeLogin_Groups(driver);
	  org.credential(username, password);
	  org.login();
  }
  @Test
	  public void g() throws IOException {
  FileOutputStream fos=new FileOutputStream("./data/keys.properties");
  Properties pro=new Properties();
  pro.setProperty("java", "selenium");
  pro.store(fos, "By Neetu");
  }
}
