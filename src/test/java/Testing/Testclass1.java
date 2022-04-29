package Testing;

import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import PomPackage.PomHomePage;
import PomPackage.StatementPage;
import baseclasses.BaseClass;

public class Testclass1 extends BaseClass {
//	 StatementPage statement1=new StatementPage(driver);;
//	 PomHomePage home=new PomHomePage(driver);
	
  @Test(priority=2)
  public void ValidateMargin() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 statement1.ClickOnButton();
	  //String opnmgn = statement1.GetOpenmargin();
//	  System.out.println(opnmgn);
//	  Assert.assertEquals(opnmgn, opnmgn,"Margin is not matching");
//	  Reporter.log("Margin Validation Successfull,Test case is pass",true);
	  
	  
  }
  @Test(priority = 3)
  public void kiteAppLogOut()
  {
	  statement1.ClickOnlogOutButton();
  }
}
