package DemoWebShopTestCsae;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import LearningDataDrivenTesting.CommonUtility;
import LearningDataDrivenTesting.DataUtility;

public class VerifyDemoRegister{

         @Test(groups = "System",dataProvider = "RegisterTestData")
		public void registration(String Firstname,String Lastname,String Email,String Password,String Confirm) {
        	 
        	 CommonUtility utility = new CommonUtility();
			
	 	    //Step1 - Launch the browser
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demowebshop.tricentis.com/register");
			
//			//Step 2 - Validate is register page is displayed
//			Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Demo page is not Displayed");
//			Reporter.log("Demo Web Shop Page Displayed",true);
//			
			//Step 3 - Performing Registration
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.id("FirstName")).sendKeys(Firstname);
			driver.findElement(By.id("LastName")).sendKeys(Lastname);
			driver.findElement(By.id("Email")).sendKeys(utility.getRandomNumnber()+Email);
			driver.findElement(By.id("Password")).sendKeys(Password);
			driver.findElement(By.id("ConfirmPassword")).sendKeys(Confirm);
			driver.findElement(By.id("register-button")).click();
			
			//Step 4: Validate if home page is displayed
			Assert.assertEquals(driver.getCurrentUrl(),"registerresult/1","Registration Failed!!");
			Reporter.log("Home Page is Displayed",true);
		
			
			//Step 5: Close Browser
			driver.close();

	}
         @DataProvider(name = "RegisterTestData")
         public Object[][] dataSupply() throws EncryptedDocumentException, IOException
         {
        	 return DataUtility.getMultipleDataFromExcelFile("Sheet1");
         }

}
