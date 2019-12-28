package firstSeleniumProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FirstTest extends Configurations {
	
	//Chrome
//	@Test
	@Disabled
	@RepeatedTest(2)
	void firstTest() throws InterruptedException {
		
		driver.get("https://www.delivery-club.ru");
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		Assert.assertTrue(title.equals("Delivery club"));
	}
	
	@Disabled
	@Test
	void firstTest2() throws InterruptedException {
		
		driver.get("https://www.delivery-club.ru");
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.equals("Delivery club"));
	}
	
	//FireFox
	@Test // Marking this method as part of the test
	void gotoSeleniumWikiPage() {
		// Go to the Wikipedia home page
		driver.get("https://en.wikipedia.org/");
		// Find the text input element by its id and type "Selenium"
		driver.findElement(By.id("searchInput")).sendKeys("Selenium");
		// Click search button		
		driver.findElement(By.id("searchButton")).click();
		// Get text from header of the Selenium page		
		String header = driver.findElement(By.id("firstHeading")).getText();
		System.out.println(header);
		// Verify that header equals "Selenium"		
		Assert.assertEquals(header, "Selenium");
	}
	
	@Test // Marking this method as part of the test
	void gotoSeleniumWikiPageFailure() {
		// Go to the Wikipedia home page
		driver.get("https://en.wikipedia.org/");
		// Find the text input element by its id and type "Selenium"
		driver.findElement(By.id("searchInput")).sendKeys("Selenium");
		// Click search button
		driver.findElement(By.id("searchButton")).click();
		// Get text from header of the Selenium page
		String header = driver.findElement(By.id("firstHeading")).getText();
		System.out.println(header);
		// Verify that header equals "Selenium WebDriver"
		Assert.assertEquals(header, "Selenium WebDriver");
	}
	

}