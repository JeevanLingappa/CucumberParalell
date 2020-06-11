package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageElements {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public  Properties prop;
	public String dir = System.getProperty("user.dir");
	public String fileName= dir+"/resources/Properties/global.properties";
	
	
	public WebDriver getWebDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(fileName);
		
		prop.load(fis);
		String SITurl = prop.getProperty("url");
		
		
		if(prop.getProperty("browser").contentEquals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").contentEquals("ie")) {
			System.setProperty("webdriver.ie.driver", "resources/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		
		
		driver.get(SITurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public void getExplicitwaitByID(String id, int timeOut) {
		wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		
	}
	
	public void getExplicitwaitByLinkText(String linkText, int timeOut) {
		wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)));
		
	}
	
	public void getExplicitwaitName(String name,int timeOut) {
		wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
		
	}
	

}
