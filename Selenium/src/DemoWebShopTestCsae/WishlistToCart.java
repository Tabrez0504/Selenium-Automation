package DemoWebShopTestCsae;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import WorkingWithTestNG.BaseTest;

public class WishlistToCart extends BaseTest{

	@Test(groups = "Integration",dependsOnGroups = "Functionality")
	public void wishlistCart()
	{
		driver.findElement(By.partialLinkText("Apparel")).click();
		
		 Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Apparel & Shoes","Apparel page is not displayed");
		Reporter.log("Apparel page is displayed",true);

	
		driver.findElement(By.partialLinkText("Blue and")).click();
		driver.findElement(By.id("add-to-wishlist-button-28")).click();
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		driver.findElement(By.name("addtocart")).click();
		driver.findElement(By.name("addtocartbutton")).click();
		
		String Ptext = driver.findElement(By.xpath("//a[@class='product-name']")).getText();
		
		 Assert.assertEquals(Ptext,"Blue and green Sneaker","Product is not Added");
		 Reporter.log("Product is Added",true);
		 


	}
}
