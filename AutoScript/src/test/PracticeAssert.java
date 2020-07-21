package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticeAssert {
  @Test
  public void f()
  {
	  int sum=30;
	  SoftAssert sa=new SoftAssert();
	  sa.fail();
	  Reporter.log("Sum is expected",true);
	  sa.assertAll();
  }
}
