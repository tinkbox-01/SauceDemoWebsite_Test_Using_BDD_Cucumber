package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

import library.Constants;
import pages.Home_Page;
import pages.Login_Page;
import utility.BaseUtil;

public class Home_Page_Test extends BaseUtil{
	
	private BaseUtil base;
	WebDriver driver;
	
	public Home_Page_Test(BaseUtil base) {
		this.base = base;
	}
	
	@Given("user navigates to the website")
	public void user_navigates_to_the_website() {
		base.driver.get(Constants.LOGIN_PAGE_URL);
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		Login_Page login = new Login_Page(base);
		login.enterUserName(Constants.VALID_USER);
		login.enterPassword(Constants.VALID_PASSWORD);
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		Login_Page login = new Login_Page(base);
		login.clickOnLoginButton();
	}
	
	@Then("user sees the home page")
	public void user_sees_the_home_page() {
		String expectedHomePageURL = Constants.HOME_PAGE_URL;
		Assert.assertEquals(expectedHomePageURL, base.driver.getCurrentUrl());
	}
	
	@When("user clicks on the add to cart button")
	public void user_clicks_on_the_add_to_cart_button() {
		Home_Page homePage = new Home_Page(base);
		homePage.selectItem(Constants.ADD_ITEM_TO_CART_1);
		homePage.selectItem(Constants.ADD_ITEM_TO_CART_2);	
		
		}

	@Then("user confirms items in cart")
	public void user_confirms_items_in_cart() {
		Home_Page homePage = new Home_Page(base);
		Assert.assertEquals(Constants.CART_PAGE_LIST_COUNT , homePage.getCartCount());
	}

	@When("user clicks on the remove button")
	public void user_clicks_on_the_remove_button() {
		Home_Page homePage = new Home_Page(base);
		homePage.removeItem(Constants.ADD_ITEM_TO_CART_1);
//		homePage.removeItem(Constants.ADD_ITEM_TO_CART_2);
	}
	
	@Then("user confirms items in cart after item is removed")
	public void user_confirms_items_in_cart_after_item_is_removed() {
		Home_Page homePage = new Home_Page(base);
		Assert.assertEquals(Constants.CART_PAGE_LIST_COUNT_AFTER_ITEM_IS_REMOVED, homePage.getCartCount());
	}

	@Then("user clicks on the filter")
	public void user_clicks_on_the_filter() {
		Home_Page homePage = new Home_Page(base);
		homePage.clickOnFilter();
	}

	@When("user clicks on the twitter button and twitter website opens")
	public void user_clicks_on_the_twitter_button_and_twitter_website_opens() {
		Home_Page homePage = new Home_Page(base);
		homePage.compareLinkURL_1();
		homePage.clickTwitterLogo();
		homePage.compareLinkURL_2();
		
		String  expectedeTwitterURL = Constants.TWITTER_URL;
		Assert.assertTrue(base.driver.getCurrentUrl().contains(expectedeTwitterURL));
	}

	@When("user clicks on the facebook button and facebook website opens")
	public void user_clicks_on_the_facebook_button_and_facebook_website_opens() {
		Home_Page homePage = new Home_Page(base);
		homePage.compareLinkURL_1();
		homePage.clickFacebookLogo();
		homePage.compareLinkURL_2();

		String  expectedSiteFacebookURL = Constants.FACEBOOK_URL;
		Assert.assertTrue(base.driver.getCurrentUrl().contains(expectedSiteFacebookURL));
	}

	@When("user clicks on the linkedin button and linkedin website opens")
	public void user_clicks_on_the_linkedin_button_and_linkedin_website_opens() {
		Home_Page homePage = new Home_Page(base);
		homePage.compareLinkURL_1();
		homePage.clickLinkedInLogo();
		homePage.compareLinkURL_2();
		String  expectedSiteLinkedInURL = Constants.LINKEDIN_URL;
		Assert.assertTrue(base.driver.getCurrentUrl().contains(expectedSiteLinkedInURL));
	}

	@Then("user see the copyright information")
	public void user_see_the_copyright_information() {
		Home_Page homePage = new Home_Page(base);
		String  expectedCopyRightInformation = Constants.COPY_RIGHT;

		Assert.assertEquals(expectedCopyRightInformation, homePage.getCopyRightText());
	}
	
}
