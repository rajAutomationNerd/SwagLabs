package testCases;

import org.testng.annotations.Test;

import pageObjects.loginPage;
import testBase.baseClass;

public class TC_002_LoginPage_invalid extends baseClass {

	
	@Test
	public void verifyLoginWithInvalidCred ()
	{
		loginPage lp= new loginPage(driver);
		lp.inputUsername(prop.getProperty("username"));
		lp.inputPassword(prop.getProperty("invalidPassword"));
		lp.loginButton();
		
	}
}
