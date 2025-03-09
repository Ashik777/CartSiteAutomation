package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageobjectClasses.LoginPage;
import pageobjectClasses.MyAccountPage;

public class LoginTestCase extends BaseTestcase {
	
	@Test
	public void logintest()
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername(p.getProperty("username"));
		login.enterPassword(p.getProperty("password"));
		login.clickLoginButton();
		MyAccountPage acpage= new MyAccountPage(driver);
		boolean status1= acpage.checksignoutbutton();
		Assert.assertEquals(status1, true);
		acpage.clickSignout();
		
		
	}

}
