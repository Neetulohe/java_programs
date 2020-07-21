package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {
   
	@Test
	public void signUp()
	{
		Reporter.log("Method Signup",true);
	}
	
	@Test(dependsOnMethods="signUp")
	public void login()
	{
		Reporter.log("LOgin method",true);
	}
	
	@Test(dependsOnMethods="login")
	public void performTask()
	{
		Reporter.log("Perform task method",true);
	}
	
	@Test(dependsOnMethods="performTask")
	public void logout()
	{
		Reporter.log("Logout method",true);
	}
}
