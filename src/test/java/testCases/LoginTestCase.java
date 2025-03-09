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
		login.enterUsername("ashikbr79@gmail.com");
		login.enterPassword("Ashik@996170");
		login.clickLoginButton();
		MyAccountPage acpage= new MyAccountPage(driver);
		boolean status1= acpage.checksignoutbutton();
		Assert.assertEquals(status1, true);
		
		
	}

}
