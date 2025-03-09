package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageobjectClasses.LoginPage;

public class LoginTestCase extends BaseTestcase {
	
	@Test
	public void logintest()
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername("ashikbr79@gmail.com");
		login.enterPassword("Ashik@996170");
		login.clickLoginButton();
		
		
	}

}
