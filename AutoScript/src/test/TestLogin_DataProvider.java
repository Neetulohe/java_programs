package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin_DataProvider extends BaseClassDataProvider{
  @Test(dataProvider="dp")
  public void testLogin (String username,String password){
	  Login_Page_Dataprovider lp=new Login_Page_Dataprovider(driver);
	  lp.credentials(username, password);
	  lp.login();
  }
  
  @DataProvider
  public String[][] dp()
  {
	  String [][] st=new String[][] {{"selenium","develop"},{"admin","admin123"}};
	  return st;
  }
}
