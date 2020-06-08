package stepDefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BasePageElements;

public class StepDefination01 extends BasePageElements {
	public WebDriver driver;
	public WebDriverWait wait;

	@Given("^user is on SeleniumEasy website$")
	public void user_is_on_seleniumeasy_website() throws Throwable {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "resources/drivers/chromedriver.exe"); driver = new ChromeDriver();
		 * driver.get("https://www.seleniumeasy.com/test/");
		 * driver.manage().window().maximize();
		 */
		
		driver = getWebDriver();
		Thread.sleep(2000);
		List<WebElement> pop1 = driver.findElements(By.linkText("No, thanks!"));

		if (pop1.size() > 0) {
			driver.findElement(By.linkText("No, thanks!")).click();
		}

	}

	@And("^click on StartPracticing$")
	public void click_on_startpracticing() throws Throwable {
		driver.findElement(By.id("btn_basic_example")).click();
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on_something(String strArg1) throws Throwable {
		System.out.println("CLicking on " + strArg1);
		// Thread.sleep(1000);
		// WebElement ele1= driver.findElement(By.linkText("Check Box Demo"));
		// driver.findElement(By.linkText(strArg1)).click();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(strArg1)));
		driver.findElement(By.linkText(strArg1)).sendKeys(Keys.ENTER);
	}

	@And("^select check box under Single check box dem0 section$")
	public void select_check_box_under_single_check_box_dem0_section() throws Throwable {
		driver.findElement(By.id("isAgeSelected")).click();

	}

	@Then("^user should get \"([^\"]*)\" message$")
	public void user_should_get_something_message(String strArg1) throws Throwable {

		Assert.assertTrue(driver.findElement(By.id("isAgeSelected")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("txtAge")).getText().contains(strArg1));
		driver.close();
	}

	// --------------Scenario 2 -----------------//

	@When("check all under Multiple check box demo section")
	public void check_all_under_Multiple_check_box_demo_section() {
		// Write code here that turns the phrase above into concrete actions
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#check1.btn.btn-primary")));

		try {
			driver.findElement(By.cssSelector("input#check1.btn.btn-primary")).click();
		} catch (Exception e) {
			driver.findElement(By.cssSelector("input#check1.btn.btn-primary")).click();
			System.out.println("Options selected");
		}
	}

	@Then("all option should be checked")
	public void all_option_should_be_checked() {
		// Write code here that turns the phrase above into concrete actions
		List<WebElement> options = driver.findElements(By.xpath("//label/input[@class='cb1-element']"));
		for (int i = 0; i < options.size(); i++)

			Assert.assertTrue(driver.findElement(By.xpath("//label/input[@class='cb1-element']")).isSelected());

	}

	@Then("user should see the Uncheck button in enabled state")
	public void user_should_see_the_Uncheck_button_in_enabled_state() {
		// Write code here that turns the phrase above into concrete actions
		String buttonValue = driver.findElement(By.cssSelector("input#check1.btn.btn-primary")).getText();
		Assert.assertTrue(driver.findElement(By.cssSelector("input#check1.btn.btn-primary")).isEnabled());
		System.out.println(buttonValue);
		// Assert.assertEquals(buttonValue, "Uncheck All");
		// Assert.assertEquals(buttonValue, "Uncheck All");
		driver.close();
	}

	// -------------Scenario3-------------

	/*
	 * @And("^check all under Multiple check box demo section$") public void
	 * check_all_under_multiple_check_box_demo_section() throws Throwable {
	 * List<WebElement> options =
	 * driver.findElements(By.xpath("//label/input[@class='cb1-element']")); for
	 * (int i = 0; i < options.size(); i++)
	 * 
	 * driver.findElement(By.xpath("//label/input[@class='cb1-element']")).click();
	 * 
	 * }
	 */

	@And("^click on uncheck all button$")
	public void click_on_uncheck_all_button() throws Throwable {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#check1.btn.btn-primary")));

		driver.findElement(By.cssSelector("input#check1.btn.btn-primary")).click();

	}

	@Then("^all option should be Unchecked$")
	public void all_option_should_be_unchecked() throws Throwable {
		List<WebElement> options = driver.findElements(By.xpath("//label/input[@class='cb1-element']"));
		for (int i = 0; i < options.size(); i++)

			Assert.assertFalse(driver.findElement(By.xpath("//label/input[@class='cb1-element']")).isSelected());

	}

	@And("^user should see the checkall button in enabled state$")
	public void user_should_see_the_checkall_button_in_enabled_state() throws Throwable {
		String name = driver.findElement(By.id("check1")).getAttribute("Value");
		System.out.println(name);
		Assert.assertEquals(name, "Check All");
		driver.close();
	}

	// -----Scenario 4

	@And("^unchecks option1 in the checkbox list$")
	public void unchecks_option1_in_the_checkbox_list() throws Throwable {
		driver.findElement(By.xpath("//label/input[@class='cb1-element']")).click();

	}

	@Then("^button should change as checkAll$")
	public void button_should_change_as_checkall() throws Throwable {
		String bName = driver.findElement(By.id("check1")).getAttribute("Value");

		Assert.assertEquals(bName, "Check All");
		driver.close();
	}

	//////////// Radio button validation ---------
	// ----------------Scenario 1

	@And("^clicks on \"([^\"]*)\" radio button$")
	public void clicks_on_something_radio_button(String strArg1) throws Throwable {
		driver.findElement(By.xpath("//input[@type='radio' and @value='Male']")).click();

	}

	@And("^clicks on getCheckedValue button$")
	public void clicks_on_getcheckedvalue_button() throws Throwable {
		driver.findElement(By.id("buttoncheck")).click();

	}

	@Then("^user should get  message with \"([^\"]*)\"$")
	public void user_should_get_message_with_something(String strArg1) throws Throwable {
		String mess = driver.findElement(By.cssSelector("p.radiobutton")).getText();
		Assert.assertEquals(mess, strArg1);
		driver.close();

	}

}
