package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroups {
  @Test(groups= {"smk testing","Funtest"})
  public void smokeTesting()
  {
	  Reporter.log("Smoke testing and Functional testing",true);
  }
  @Test(groups= {"Funtest"})
  public void FunctionalTesting()
  {
	  Reporter.log("Functional testing",true);
  }
  @Test(groups= {"IntTest","RegTest"})
  public void IntegrationTesting()
  {
	  Reporter.log("Integration testing and Regression testing",true);
  }
  @Test(groups= {"sys testing","RegTest"})
  public void Regression()
  {
	  Reporter.log("System testing and Regression testing",true);
  }
  @Test(groups= {"Adtesting"})
  public void adhocTesting()
  {
	  Reporter.log("Adhoc testing",true);
  }

}
