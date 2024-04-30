package DemoWebShopTestCsae;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import WorkingWithTestNG.BaseTest;

public class EmailSubscribe extends BaseTest{
	
	@Test
	public void subcribe()
	{
		driver.findElement(By.id("newsletter-email")).sendKeys("tabrezshaikh@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		
		if(driver.findElement(By.xpath("//div[@id='newsletter-result-block']")).getText().equals("Thank you for signing up! A verification email has been sent. We appreciate your interest."))
		{
			System.out.println("Email Subscribtion is Succesfull");
		}
		else
		{
			System.out.println("Email Subscribtion is not Succesfull");
		}
	}

}
