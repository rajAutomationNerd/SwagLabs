package testCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.loginPage;
import testBase.baseClass;

public class TC_001_LoginPage_valid extends baseClass {
	
	
	@Test
	public void verifyLoginWithValidCredentials()
	{
		
		try {
		logger.info("*****Starting verifyLoginWithValidCredentials");
		logger.info("*******Opening login page***********");
		loginPage lp=new loginPage(driver);
		
		logger.info("**********Enterting username**********");
		lp.inputUsername(prop.getProperty("username"));
		logger.info("*************Enterting Password**************");
		lp.inputPassword(prop.getProperty("password"));
		logger.info("*****Clicking on login button*****************");
		lp.loginButton();
		}
		catch(Exception e) {
			logger.error("Test Failed>>>");
			logger.debug("Debug Logs>>>>>>>>>");
			Assert.fail();
			
		}
		
		logger.info("******test case execution is finished***********");
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
	}

}
