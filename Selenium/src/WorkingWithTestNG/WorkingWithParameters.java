package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingWithParameters {
	
	
	@Parameters({"url","email","password"})
	@Test
	public void parameters(String url,String email,String password) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Demo page is not Displayed");
		Reporter.log("Demo Web Shop Page Displayed",true);
		
		driver.findElement(By.linkText("Log in")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","Login page is not Displayed");
		Reporter.log("Demo Web Shop Login Page Is Displayed",true);
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		
		Thread.sleep(2000);
		driver.close();
	}

}
