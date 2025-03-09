package pageobjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[text()='Sign out']") private WebElement signout;
	
	public boolean checksignoutbutton()
	{
		boolean status=signout.isDisplayed();
		return status;
	}

}
