package test;


import org.testng.annotations.Test;


import qsppompage.LoginPage;

public class Validlogin extends Baseclass {
  @Test
  public void validlogin () 
  {
	  LoginPage lp=new LoginPage(driver);
	lp.credentials("admin","admin123");
	lp.login();
  }
  
}
