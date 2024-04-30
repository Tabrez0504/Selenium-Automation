package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithSoftAssert {
	
	@Test
	public void softAssert() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),"qwede","Demo page is not Displayed");
		System.out.println("Demo web shop psge is dispaleyd");
		
		driver.findElement(By.linkText("Log in")).click();

		sa.assertEquals(driver.getTitle(),"Demo Web Shop. Login","Login page is not Displayed");
		System.out.println("Demo Web Shop Login Page Is Displayed");
		
		driver.findElement(By.id("Email")).sendKeys("tabrezshaikh@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tbzshaikh@123");
		
		Thread.sleep(2000);
		driver.close();
		sa.assertAll();
	}

}
