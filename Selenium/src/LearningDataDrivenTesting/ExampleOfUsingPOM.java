package LearningDataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import LearningPOM.HomePage;
import LearningPOM.LoginPage;

public class ExampleOfUsingPOM {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataUtility utility = new DataUtility();
		
       //Step1: To Launch the browser
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(utility.getDataFromPropertiesFile("url"));
		
		
		HomePage home_page = new HomePage(driver);
		home_page.getLoginLink().click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","Login Page not Displayed");
		Reporter.log("Login Page Displayed",true);
		
		LoginPage login_page = new LoginPage(driver);
		login_page.getEmailTextField().sendKeys(utility.getDataFromPropertiesFile("email"));
		login_page.getPasswordTxtField().sendKeys(utility.getDataFromPropertiesFile("pwd"));
		login_page.getLoginButton().click();
		
		 Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Demo page is not Displayed");
		Reporter.log("Demo Web Shop Page Displayed",true);
		
		home_page.getLogoutLink().click();
		
		driver.close();



	}

}
