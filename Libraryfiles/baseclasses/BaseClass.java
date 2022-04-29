package baseclasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import PomPackage.PomHomePage;
import PomPackage.PomLoginPage;
import PomPackage.PomPinPage;
import PomPackage.StatementPage;
import Utilitypackage.utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public PomLoginPage login;
	 public PomPinPage pin;
	 public PomHomePage Home;
	 public StatementPage statement1;
	protected static WebDriver driver;
	

	public void Browserlounch(String Browsername) throws IOException
	{  
		if(Browsername.equals("chrome"))
	   {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	    }
	else 
	    {
			WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
	    }
	
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		login=new PomLoginPage(driver);
		pin=new PomPinPage(driver);
		Home=new PomHomePage(driver);
		 statement1=new StatementPage(driver);
		 
		
	}
	public static String takesScrrenshot(String TCName) throws IOException {
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\screenshots\\Screenshot"+TCName+".png";
		File destination=new File(path);
		FileHandler.copy(scr, destination);
		return path;
		
	}
	
	public void Closebrowser()
	{
		driver.close();
	}

}
