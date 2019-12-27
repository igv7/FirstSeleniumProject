package firstSeleniumProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class FirstTest extends Configurations {
	
//	@Test
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
		Assert.assertTrue(title.equals("Delivery club"));
	}
	

}