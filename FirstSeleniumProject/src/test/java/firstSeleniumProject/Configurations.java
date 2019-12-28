package firstSeleniumProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configurations {
	
//	public ChromeDriver driver;
	public WebDriver driver;
	
	@BeforeEach
	void init() {
		//Chrome
		System.setProperty("webdriver.chrome.driver", "/Users/Igor/Downloads/chromedriver/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();//
//		driver = new ChromeDriver();
		
		//FireFox
		System.setProperty("webdriver.gecko.driver", "/Users/Igor/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		
		System.out.println("Start Test");
	}
	
	@AfterEach
	void destroy() {
		driver.quit();
		System.out.println("End Test");
	}

}
