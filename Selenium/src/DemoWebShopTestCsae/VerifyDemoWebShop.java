package DemoWebShopTestCsae;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LearningDataDrivenTesting.DataUtility;
import WorkingWithTestNG.BaseTest;



public class VerifyDemoWebShop extends BaseTest {

	
@Test(groups = "Functionality")
	public void addToCartTestCase() {
		//Step 6: To Naviagte to Books
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
		
		//Step 7: Validate Books page is displayed or not
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books","Books page is not Displayed");
		Reporter.log("BooksPage Displayed",true);
		
		//Step 8: Click on Fiction Ex book
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/h2/a")).click();
		
		
		//Step 9:Validate Fiction Ex Page is displayed or not
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Fiction EX","Fiction Ex Page not Displayed...");
		Reporter.log("Fiction Ex Page Displayed...",true);
		
		
		//Step 10: Click on Add to Wishlist Button
		driver.findElement(By.id("add-to-wishlist-button-78")).click();
		
		
		//Step 11: Click on Wishlist button
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		
		
		//Step 12:Validate wishlist page is dispalyed
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Wishlist","Wishlist Page not Displayed...");
		Reporter.log("Wishlist Page Displayed...",true);
	
		
		//Step 13: Validate Product is displayed in Wishlist or not
		
		String Wtext = driver.findElement(By.xpath("//a[text()='Fiction EX']")).getText();
		
		Assert.assertEquals(Wtext,"Fiction EX","Product is not dispalyed");
		Reporter.log("Product is dispalyed",true);
	
		//Step 14: Remove product from the wishlist
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		
		//Step 15:Validate Wishlist is empty dispalyed
		
		String WishEmpty = driver.findElement(By.xpath("//div[@class='wishlist-content']")).getText();
		
		Assert.assertEquals(WishEmpty,"The wishlist is empty!","Wishlist is emtpy not dispalyed");
		Reporter.log("Wishlist is emtpy  dispalyed",true);

	
	}
}


