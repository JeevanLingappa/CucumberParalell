package stepDefinations;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BasePageElements;

public class Hooks extends BasePageElements {
	public WebDriver driver;
	
	@Before("@RadioButton")
	public void initializeTest() throws IOException {
		
		//driver = getWebDriver();
		System.out.println("Initialising the browser");
		
	}
	
	
	@After("@RadioButton")
	public void tearDown() {
		
		System.out.println("CLosing the browser");
		//driver.close();
	}

}
