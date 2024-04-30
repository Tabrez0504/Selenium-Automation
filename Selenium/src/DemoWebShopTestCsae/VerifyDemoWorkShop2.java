package DemoWebShopTestCsae;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import WorkingWithTestNG.BaseTest;

@Listeners(WorkingWithTestNG.ListernersImplementation.class)
public class VerifyDemoWorkShop2 extends BaseTest{

	@Test(groups = "Integration")
	public void AddtoCart() throws InterruptedException {
		
		// Step 1: To launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demowebshop.tricentis.com/");
	    
		// Step 2: Validate Demo Web Shop page is displayed or not 
	    Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Demo page is not Displayed");
		Reporter.log("Demo Web Shop Page Displayed",true);

		// Step 3: Clicking on Login button
	    driver.findElement(By.linkText("Log in")).click();

		// Step 4: Validate Login page displayed or not 
	    
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","Login Page not Displayed");
		Reporter.log("Login Page Displayed",true);
	 
		// Step 5: Performing Login
		driver.findElement(By.id("Email")).sendKeys("tabrezshaikh@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tbzshaikh@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		// Step 6: To navigate to Digital downloads
        driver.findElement(By.partialLinkText("Digital downloads")).click();

		// Step 7: Validate Digital downloads page is displayed or not
        
        Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Digital downloads","Digital downloads page is not displayed");
		Reporter.log("Digital downloads page is displayed",true);

		// Step 8: Located all AddToCart buttons

		List<WebElement> allProducts = driver.findElements(By.xpath("//input[@value='Add to cart']"));

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

		// Step 9: To Add all the products to the cart

		for (WebElement product : allProducts){

		      product.click();

		      wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//a[text()='shopping cart']"))));

		      Thread.sleep(1000);
		}

		// Step 10: To navigate to shopping cart

		driver.findElement(By.xpath("//span[text()= 'Shopping cart']")).click();

		// Step 11: validate shopping cart page is displayed or not
		
		 Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Shopping Cart","Shopping cart page not displayed");
		 Reporter.log("Shopping Cart page displayed",true);


		List<WebElement> cartProducts = driver.findElements(By.xpath("//tr[@class='cart-item-row']"));

		// Step 12: Validate the number of products in shopping cart
		
		
		 Assert.assertEquals(allProducts.size(),cartProducts.size(),"AddToCart Test Case Fail");
		 Reporter.log("AddToCart Test Case Pass",true);

		List<WebElement> Remove=driver.findElements(By.name("removefromcart"));

		for (WebElement removeCheckBox : Remove)
		{

		 removeCheckBox.click();

		}

		driver.findElement(By.name("updatecart")).click();

		// Step 13: performing Logout
		driver.findElement(By.linkText("Log out")).click();

		// Step 14: To close the browser
		driver.close();

	}
	

}
