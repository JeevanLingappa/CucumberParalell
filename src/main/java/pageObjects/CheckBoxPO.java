package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPO {
	public WebDriver driver;
	// String strArg1 = Step;

	public CheckBoxPO(WebDriver driver) {
		this.driver = driver;

	}

	By select = By.id("isAgeSelected");
	By textValidation = By.id("txtAge");

	public WebElement getSingleSelect() {

		return driver.findElement(select);
	}

	public WebElement getTextValidation() {

		return driver.findElement(textValidation);
	}
}
