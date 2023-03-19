package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import library.Constants;
import utility.BaseUtil;

public class Burger_Menu_Page extends BaseUtil{

	private BaseUtil base;
	
	public Burger_Menu_Page(BaseUtil base) {
		this.base = base;
		PageFactory.initElements(base.driver, this);
	}
	
	By countOfCart = By.xpath("//div[@id='shopping_cart_container']/a/span");
	By removeItemButton = By.xpath("//button[@id='remove-sauce-labs-bike-light']");
	By addItemButton = By.xpath("");
	By burgerMenuButton = By.id("react-burger-menu-btn");
	By allItemsButton = By.id("inventory_sidebar_link");
	By logoutButton = By.id("logout_sidebar_link");
	By aboutButton = By.xpath("//a[@id='about_sidebar_link']");
	By resetAppStateButton = By.id("reset_sidebar_link");
	By resetCartValue = By.id("shopping_cart_link");
	By cartButton = By.id("shopping_cart_container");
	

	
	public void clickOnBurgerMenuButton() {
		base.driver.findElement(burgerMenuButton).click();
	}
	
	public void clickOnAllItemsButton() {
		base.driver.findElement(allItemsButton).click();
	}
	
	public void clickOnLogoutButton() {
		base.driver.findElement(logoutButton).click();
	}
	
	public void clickOnAboutButton() {
		base.driver.findElement(aboutButton).click();
	}
	
	public void clickOnResetAppButton() {
		base.driver.findElement(resetAppStateButton).click();
	}
	
	public void resetAppValue() {
//		base.driver.findElements(By.id("shopping_cart_link")).size();
		
//	      WebElement n =base.driver.findElement(By.id("shopping_cart_link"));
	      //check if element visible
//	      boolean t = base.driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a/span")).isDisplayed();
//	      if (t) {
//	         System.out.println("Element is dispalyed");
//	      } else {
//	         System.out.println("Element is not dispalyed");
//	      }
		
	}
	
	public void clickOnCartButton() {
		base.driver.findElement(cartButton).click();
	}
	
	public void selectItem(String itemName) {
		List<WebElement> items = base.driver.findElements(By.xpath("//a[@id='item_4_title_link']/div/../../../../../../div/div/div[2]/div/a/div"));
		List<WebElement> addToCartButton = base.driver.findElements(By.xpath("//a[@id='item_4_title_link']/div/../../../../../../div/div/div[2]/div[2]/button"));
			
		for(int i=0; i<items.size(); i++) {
						
			String text = items.get(i).getText();
			if(text.equalsIgnoreCase(itemName)) {
				addToCartButton.get(i).click();
			}
		}		
	}
	
	public void compareLinkURL_1() {
	base.driver.getWindowHandle();
	assert base.driver.getWindowHandles().size() == 1;
	}
	

	public void compareLinkURL_2() {
	WebDriverWait wait = new WebDriverWait(base.driver,2);
	wait.until(ExpectedConditions.numberOfWindowsToBe(2));

	for (String windowHandle : base.driver.getWindowHandles()) {
		if(!base.driver.getWindowHandle().contentEquals(windowHandle)) {
			base.driver.switchTo().window(windowHandle);
	    break;
	   	}
	  }
	}
}
