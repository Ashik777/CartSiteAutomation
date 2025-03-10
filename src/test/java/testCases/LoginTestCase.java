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
		logger.info("enterd user name and password");
		login.clickLoginButton();
		logger.info("clicked on the loggin button");
		MyAccountPage acpage= new MyAccountPage(driver);
		boolean status1= acpage.checksignoutbutton();
		logger.info("clicked on signout button");
		Assert.assertEquals(status1, true);
		acpage.clickSignout();
		
		
	}

}
