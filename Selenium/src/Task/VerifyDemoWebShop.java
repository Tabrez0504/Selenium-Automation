package Task;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import LearningDataDrivenTesting.DataUtility;
import WorkingWithTestNG.BaseTest;

public class VerifyDemoWebShop extends BaseTest {

	
@Test
	public void addToCartTestCase() {
		//Step 6: To Naviagte to Books
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
		
		//Step 7: Validate Books page is displayed or not
		if(driver.getTitle().equals("Demo Web Shop. Books"))
		{
			System.out.println("Books Page Displayed...");
		}else {
			System.out.println("Books Page not Displayed...");
		}
		
		//Step 8: Click on Fiction Ex book
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/h2/a")).click();
		
		
		//Step 9:Validate Fiction Ex Page is displayed or not
		if(driver.getTitle().equals("Demo Web Shop. Fiction EX"))
		{
			System.out.println("Fiction Ex Page Displayed...");
		}else {
			System.out.println("Fiction Ex Page not Displayed...");
		}
		
		
		//Step 10: Click on Add to Wishlist Button
		driver.findElement(By.id("add-to-wishlist-button-78")).click();
		
		
		//Step 11: Click on Wishlist button
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		
		
		//Step 12:Validate wishlist page is dispalyed
		if(driver.getTitle().equals("Demo Web Shop. Wishlist"))
		{
			System.out.println("Wishlist Page Displayed...");
		}else {
			System.out.println("Wishlist Page not Displayed...");
		}
		
		
		//Step 13: Validate Product is displayed in Wishlist or not
		if(driver.findElement(By.xpath("//a[text()='Fiction EX']")).getText().equals("Fiction EX"))
		{
			System.out.println("Product is dispalyed");
		}else {
			System.out.println("Product is not dispalyed");
		}

		//Step 14: Remove product from the wishlist
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		
		//Step 15:Validate Wishlist is empty dispalyed
		if(driver.findElement(By.xpath("//div[@class='wishlist-content']")).getText().equals("The wishlist is empty!"))
		{
			System.out.println("Wishlist is emtpy  dispalyed");
		}else {
			System.out.println("Wishlist is emtpy not dispalyed");
		}
		
		
		

	}
}


