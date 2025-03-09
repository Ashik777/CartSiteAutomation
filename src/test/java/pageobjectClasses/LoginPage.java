package pageobjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="username") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="//input[@name='login']") private WebElement loginButton;
	
	public void enterUsername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}

}
