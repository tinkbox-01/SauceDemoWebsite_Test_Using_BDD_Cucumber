package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseUtil;

public class Home_Page extends BaseUtil{
	
	private BaseUtil base;
	
	public Home_Page(BaseUtil base) {
		this.base = base;
		PageFactory.initElements(base.driver, this);
	}
	
	By countOfCart = By.xpath("//div[@id='shopping_cart_container']/a/span");
	By removeItemButton = By.xpath("//button[@id='remove-sauce-labs-bike-light']");
	By addItemButton = By.xpath("");
	By filter = By.xpath("//select[@data-test='product_sort_container']");
	
	By twitter = By.xpath("//div[@id='page_wrapper']/footer/ul/li[1]/a");
	By facebook = By.xpath("//div[@id='page_wrapper']/footer/ul/li[2]/a");
	By linkedin = By.xpath("//div[@id='page_wrapper']/footer/ul/li[3]/a");
	By copyRight = By.xpath("//div[@id='page_wrapper']/footer/div");
	
	
	public String getCopyRightText() {
		String copy = base.driver.findElement(copyRight).getText();
		return copy;
	}
	
	public String getCartCount() {
		String cartCount = base.driver.findElement(countOfCart).getText();
		return cartCount;
	}
	
	public void textOfRemoveItemButton() {
		base.driver.findElement(removeItemButton).getText();
	}
	
	public void clickOnRemoveButton() {
		base.driver.findElement(removeItemButton).click();
	}
	
	public void clickOnFilter() {
		base.driver.findElement(filter).click();
	}
	
	public void clickTwitterLogo() { 
		base.driver.findElement(twitter).click();
	}
	
	public void clickFacebookLogo() { 
		base.driver.findElement(facebook).click();
	}
	
	public void clickLinkedInLogo() {
		base.driver.findElement(linkedin).click();
	}
	
	public void getTwitterLogo() { 
		base.driver.findElement(twitter).getText();
	}
	
	public void selectItem(String itemName) {
		List<WebElement> items = base.driver.findElements(By.xpath("//a[@id='item_4_title_link']/div/../../../../../../div/div/div[2]/div/a/div"));
		List<WebElement> addToCartButton = base.driver.findElements(By.xpath("//a[@id='item_4_title_link']/div/../../../../../../div/div/div[2]/div[2]/button"));
			
		for(int i=0; i<items.size(); i++) {
						
			String text = items.get(i).getText();
			if(text.equalsIgnoreCase(itemName)) {
				addToCartButton.get(i).click();
//				String arrayItem[] = {itemName};
			}
		}		
	}
	
	public void removeItem(String itemName) {
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
	WebDriverWait wait = new WebDriverWait(base.driver,5);
	wait.until(ExpectedConditions.numberOfWindowsToBe(2));

	for (String windowHandle : base.driver.getWindowHandles()) {
		if(!base.driver.getWindowHandle().contentEquals(windowHandle)) {
			base.driver.switchTo().window(windowHandle);
	    break;
	   	}
	  }
	}
}
