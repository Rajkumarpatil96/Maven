package PomPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatementPage {
	WebDriver driver;

@FindBy(xpath="(//div[@class='six columns'])[1]")private WebElement openmargin;
@FindBy(xpath="//a[@target='_self']")private WebElement LogOutButton;
@FindBy(xpath="//span[@class='user-id']")private WebElement Userid;
@FindBy(xpath="//button[@type='submit']")private WebElement Button;
public StatementPage(WebDriver driver)
{		 
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

  public String GetOpenmargin()
{
		
	String Margin = openmargin.getText();
	return Margin;
}
  public void ClickOnButton()
{
	  Set<String> AllWinId = driver.getWindowHandles();
		Iterator<String> it = AllWinId.iterator();
		String DashBoardid = it.next();
		String Statementid = it.next();
		driver.switchTo().window(Statementid);
	Button.click();
}

public void ClickOnlogOutButton()
{	Userid.click();
	LogOutButton.click();
}
}
