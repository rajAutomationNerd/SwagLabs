package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	public WebDriver driver;

	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	WebElement txtUsername;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(id="login-button")
	WebElement submitButton;
	
	public void inputUsername(String username)
	{
		txtUsername.sendKeys(username);
	}
	
	public void inputPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void loginButton()
	{
		submitButton.click();
	}

}
