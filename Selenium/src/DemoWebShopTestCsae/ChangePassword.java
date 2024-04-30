package DemoWebShopTestCsae;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import WorkingWithTestNG.BaseTest;

public class ChangePassword extends BaseTest{

	@Test
	public  void changePassword() {
		
		driver.findElement(By.xpath("//a[@class='account']")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Account","Account page is not dispaleyd");
		Reporter.log("Account page is dispaleyd",true);
		
		driver.findElement(By.linkText("Change password")).click();
		driver.findElement(By.name("OldPassword")).sendKeys("Tbzshaikh@123");
		driver.findElement(By.name("NewPassword")).sendKeys("Tbzshaikh@123");
		driver.findElement(By.name("ConfirmNewPassword")).sendKeys("Tbzshaikh@123");
		driver.findElement(By.xpath("//input[@class='button-1 change-password-button']")).click();
		
		
		String Ptext = driver.findElement(By.xpath("//div[@class='result']")).getText();
		
		Assert.assertEquals(Ptext,"Password was changed","Password is not changed");
		Reporter.log("Password is changed",true);

	}

}
