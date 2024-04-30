package DemoWebShopTestCsae;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import WorkingWithTestNG.BaseTest;



public class BookTestCase extends BaseTest {
	
	@Test(groups = "booksTestCase")
	public void booksTestCase() {
		driver.findElement(By.partialLinkText("Books")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books","Books page is not Displayed");
		Reporter.log("BooksPage Displayed",true);
	}
	@Test(groups = "computingTestCase")
	public void computingAndInternetTestCase() {
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//a[.='Computing and Internet']")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computing and Internet","Computing And Internet Test Case Fail...");
		Reporter.log("Computing And Internet Test Case Pass...",true);
		
		
	}

}
