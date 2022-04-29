package PomPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomHomePage {
	WebDriver driver;
@FindBy(xpath="//span[@class='user-id']")private WebElement Userid;

@FindBy(xpath="(//div[@class='value'])[1]")private WebElement MarginAvailable;
@FindBy(xpath="(//*[@class='row']//*[text()='View statement'])[1]")private WebElement viewstatementButton;

public PomHomePage(WebDriver driver)
{   this. driver=driver;
	PageFactory.initElements(driver, this);
}
public String getuserid()
{
	String text = Userid.getText();
	return text;
	
}
public String getMarginAvailable()
{
	String avlMargin = MarginAvailable.getText();
	return avlMargin;
	
}
public void clickOnViewStatementButton()
{
	viewstatementButton.click();
	
	

}
//public void ClickOnLogoutButton()
//{
//	Userid.click();
//	LogOutButton.click();
//	
//}
}
