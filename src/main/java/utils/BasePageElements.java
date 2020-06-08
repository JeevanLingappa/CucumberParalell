package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePageElements {
	
	public WebDriver driver;
	public  Properties prop;
	public String dir = System.getProperty("user.dir");
	public String fileName= dir+"/resources/Properties/global.properties";
	
	
	public WebDriver getWebDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(fileName);
		
		prop.load(fis);
		String SITurl = prop.getProperty("url");
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(SITurl);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	

}
