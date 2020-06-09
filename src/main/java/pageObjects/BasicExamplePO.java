
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicExamplePO {
	public WebDriver driver;
	//String strArg1 = Step;
	
	public BasicExamplePO(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//By simpleForm = By.linkText(strArg1);
	
	public WebElement getSimpleForm(String strArg1) {
		
		// driver.findElement(simpleForm);
		 return driver.findElement(By.linkText(strArg1));
	}

}
