package pages;

import org.openqa.selenium.By;

import utility.BaseUtil;

public class Login_Page extends BaseUtil{
	
	private BaseUtil base;
	public Login_Page(BaseUtil base) {
		this.base = base;
	}

	By username = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");
	By loginErrorMessage = By.xpath("//div[@id='login_button_container']/div/form/div[3]/h3/button");
	
	public void enterUserName(String user) {
		base.driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pword) {
		base.driver.findElement(password).sendKeys(pword);
	}
	
	public void clickOnLoginButton() {
		base.driver.findElement(loginButton).click();
	}
	
	public String displayLoginErrorMessage() {
		String errorMessage = base.driver.findElement(loginErrorMessage).getText();
		return errorMessage;
		
	}
}
