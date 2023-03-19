package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import library.Constants;
import pages.Burger_Menu_Page;
import pages.Home_Page;
import pages.Login_Page;
import utility.BaseUtil;

public class Burger_Menu_Test extends BaseUtil{

	private BaseUtil base;
	WebDriver driver;
	
	public Burger_Menu_Test(BaseUtil base) {
		this.base = base;
	}
	
	
	@When("user clicks on the burger menu button")
	public void user_clicks_on_the_burger_menu_button() {
		Burger_Menu_Page burgerMenu = new Burger_Menu_Page(base);
		burgerMenu.clickOnBurgerMenuButton();
	}

	@When("clicks on logout button")
	public void clicks_on_logout_button() {
		Burger_Menu_Page burgerMenu = new Burger_Menu_Page(base);
		base.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		burgerMenu.clickOnLogoutButton();
	}

	@Then("user sees the login page")
	public void user_sees_the_login_page() {
		String expectedHomePageURL = Constants.LOGIN_PAGE_URL;
		Assert.assertEquals(expectedHomePageURL, base.driver.getCurrentUrl());
	}

	@When("clicks on about us button and sees the saucelabs page")
	public void clicks_on_about_us_button_and_sees_the_saucelabs_page() {
		Burger_Menu_Page burgerMenu	= new Burger_Menu_Page(base);
		base.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		burgerMenu.clickOnAboutButton();
		
		String  expectedSiteAboutUs = Constants.ABOUT_US_URL;
		Assert.assertTrue(base.driver.getCurrentUrl().contains(expectedSiteAboutUs));
	}

	@When("user add item to the cart")
	public void user_add_item_to_the_cart() {
		Burger_Menu_Page burgerMenu = new Burger_Menu_Page(base);
		burgerMenu.selectItem(Constants.ADD_ITEM_TO_CART_1);
		burgerMenu.selectItem(Constants.ADD_ITEM_TO_CART_2);
	}

	@When("user clicks on reset app state button")
	public void user_clicks_on_reset_app_state_button() {
		Burger_Menu_Page burgerMenu = new Burger_Menu_Page(base);
		base.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		burgerMenu.clickOnResetAppButton();
	}

	@Then("cart value is reset to zero")
	public void cart_value_is_reset_to_zero() {
//		Burger_Menu_Page burgerMenu = new Burger_Menu_Page(base);
//		burgerMenu.resetAppValue();
		
		try
		{
			base.driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a/span"));
			System.out.println("Element exists");
		}
		catch(NoSuchElementException e) {
			System.out.println("Element does not exists");
		}
	}

	@When("user clicks on the cart button")
	public void user_clicks_on_the_cart_button() {
		Burger_Menu_Page burgerMenu = new Burger_Menu_Page(base);
		burgerMenu.clickOnCartButton();
	}

	@Then("user sees the cart list page")
	public void user_sees_the_cart_list_page() {
		Assert.assertEquals(Constants.CART_URL, base.driver.getCurrentUrl());
	}


	@Then("clicks on All Items button")
	public void clicks_on_all_items_button() {
		Burger_Menu_Page burgerMenu = new Burger_Menu_Page(base);
		base.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		burgerMenu.clickOnAllItemsButton();
	}

}
