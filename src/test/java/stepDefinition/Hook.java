package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import library.Browsers;
import utility.BaseUtil;

public class Hook extends BaseUtil{
	
	private BaseUtil base;
	public Hook (BaseUtil base) {
		this.base = base;
	}
	
	@Before
	public void setUp() {
		base.driver = Browsers.launchBrowser("Chrome");
	}
	
	@After
	public void shutDown() {
		base.driver.quit();
	}
}
