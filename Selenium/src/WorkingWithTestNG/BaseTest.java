package WorkingWithTestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import LearningDataDrivenTesting.DataUtility;

public class BaseTest {
	public DataUtility data=new DataUtility();
	public static WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data.getDataFromPropertiesFile("url"));
	
	}
	
	@BeforeMethod(alwaysRun = true)
	public void performLogin() throws IOException {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(data.getDataFromPropertiesFile("email"));
		driver.findElement(By.id("Password")).sendKeys(data.getDataFromPropertiesFile("pwd"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod(alwaysRun = true)
	public void performLogout() {
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.close();
	}
	
	//Used in VerifyDemoWebShop In Task Package

}
