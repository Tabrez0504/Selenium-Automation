package DemoWebShopTestCsae;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import WorkingWithTestNG.BaseTest;

public class EmailProduct extends BaseTest {

	@Test
	public void emailproduct()
	{
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("camera");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Search","Camera page is not displayed");
		Reporter.log("Camera page is displayed",true);
		
		
		driver.findElement(By.xpath("//img[@alt='Picture of Digital SLR Camera 12.2 Mpixel']")).click();
        driver.findElement(By.xpath("//input[@class='button-2 email-a-friend-button']")).click();
		driver.findElement(By.xpath("//input[@class='friend-email']")).sendKeys("tabrezshaikh7624@gmail.com");
		driver.findElement(By.xpath("//input[@class='button-1 send-email-a-friend-button']")).click();
		
		String Etext = driver.findElement(By.xpath("//div[@class='result']")).getText();
		
		Assert.assertEquals(Etext,"Your message has been sent.","Email not sent");
		Reporter.log("Email is sent",true);
		
	      
	}
	
}
