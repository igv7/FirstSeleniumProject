package firstSeleniumProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configurations {
	
//	public ChromeDriver driver;
	public WebDriver driver;
	
	@BeforeEach
	void init() {
		System.setProperty("webdriver.chrome.driver", "/Users/Igor/Downloads/chromedriver/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		System.out.println("Start Test");
	}
	
	@AfterEach
	void destroy() {
		driver.quit();
		System.out.println("End Test");
	}

}
