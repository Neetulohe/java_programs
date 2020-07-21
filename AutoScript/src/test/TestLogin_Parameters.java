package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class TestLogin_Parameters extends BaseClassParameters{
	
	  
  @Parameters({"username","password"})
  @Test
  public void login(String username,String password)
  {
	  OrangeParameters op=new OrangeParameters(driver);
	  op.credential(username,password);
	  op.login();
  }
}
