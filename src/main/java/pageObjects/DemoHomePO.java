package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoHomePO {

	public WebDriver driver;

	public DemoHomePO(WebDriver driver) {
		this.driver = driver;

	}

	By popUp = By.linkText("No, thanks!");
	By startPractice = By.id("btn_basic_example");

	public WebElement getPopUp() {

		return driver.findElement(popUp);

	}

	public List<WebElement> getPopUpList() {

		return driver.findElements(popUp);

	}
	
	public WebElement getStartPractice() {

		return driver.findElement(startPractice);

	}
}
