package stepDefinition;



import org.junit.Assert;

import io.cucumber.java.en.*;

import library.Constants;
import pages.Login_Page;
import utility.BaseUtil;

public class Login_Page_Test extends BaseUtil{
	
	private BaseUtil base;
	
	public Login_Page_Test (BaseUtil base) {
		this.base = base;
	}

	@Given("user navigates to website")
	public void user_navigates_to_website() {
		base.driver.get(Constants.LOGIN_PAGE_URL);
	}

	@Then("user confirms website URL")
	public void user_confirms_website_url() {
		String expectedLoginPageURL = Constants.LOGIN_PAGE_URL;
		Assert.assertEquals(expectedLoginPageURL, base.driver.getCurrentUrl());
	}

	@Then("user confirms page title")
	public void user_confirms_page_title() {
		String expectedLoginPageTitle = Constants.LOGIN_PAGE_TITLE;
		Assert.assertEquals(expectedLoginPageTitle, base.driver.getTitle());
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
		Login_Page login = new Login_Page(base);
		login.enterUserName(Constants.VALID_USER);
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
		Login_Page login = new Login_Page(base);
		login.enterPassword(Constants.VALID_PASSWORD);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		Login_Page login = new Login_Page(base);
		login.clickOnLoginButton();
	}

	@Then("user sees home page")
	public void user_sees_home_page() {
		String expectedHomePageURL = Constants.HOME_PAGE_URL;
		Assert.assertTrue(base.driver.getCurrentUrl().contains(expectedHomePageURL));
	}

	@When("user enters invalid username")
	public void user_enters_invalid_username() {
		Login_Page login = new Login_Page(base);
		login.enterUserName(Constants.INVALID_USER);
	}

	@When("user enters invalid password")
	public void user_enters_invalid_password() {
		Login_Page login = new Login_Page(base);
		login.enterPassword(Constants.INVALID_PASSWORD);
	}

	@Then("user gets error message")
	public void user_gets_error_message() {
		Login_Page login = new Login_Page(base);
		login.displayLoginErrorMessage();
		String expectedLoginError = Constants.LOGIN_PAGE_ERROR_MESSAGE;
		Assert.assertSame(expectedLoginError, login.displayLoginErrorMessage());
	}

	@Then("user remains on login page")
	public void user_remains_on_login_page() {
		String expectedLoginPageURL = Constants.LOGIN_PAGE_URL;
		Assert.assertEquals(expectedLoginPageURL, base.driver.getCurrentUrl());
	}

	@When("user leaves username blank")
	public void user_leaves_username_blank() {
		Login_Page login = new Login_Page(base);
		login.enterUserName("");
	}

	@When("user leaves password blank")
	public void user_leaves_password_blank() {
		Login_Page login = new Login_Page(base);
		login.enterPassword("");
	}
}
