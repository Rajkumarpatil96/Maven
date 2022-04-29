package Testing;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PomPackage.PomHomePage;
import PomPackage.PomLoginPage;
import PomPackage.PomPinPage;
import PomPackage.StatementPage;
import Utilitypackage.utility;
import baseclasses.BaseClass;

public class Testclass extends BaseClass {
	
	
	@Parameters("Browsername")
	
	@BeforeClass
	public void Lounchbrowser(String Browsername) throws  IOException
	{
		Browserlounch(Browsername);
		
		
		
	}
	@BeforeMethod
	public void loginKiteApp() throws EncryptedDocumentException, IOException
	{
		login.enterUserid("DAA677");
		login.enterpassword("Velocity@123");
		login.ClickOnlogiButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		pin.Enterpin("866918");
		pin.ClickOnContinueButton();
		
	}
  @Test(priority=1)
  public void validateUsername() throws EncryptedDocumentException, IOException 
  {
	  String Actualuserid = Home.getuserid();
	  String expecteduserid = "DAA677";
	  Assert.assertEquals(Actualuserid, expecteduserid,"Userid is not matching");
	  Reporter.log("Test case validated ,Test case is passed");
	  
//	  String AvailableMargin = Home.getMarginAvailable();
//	  System.out.println(AvailableMargin);
//	  Assert.assertEquals(AvailableMargin,AvailableMargin );
	  Home.clickOnViewStatementButton();
  }
  
}
