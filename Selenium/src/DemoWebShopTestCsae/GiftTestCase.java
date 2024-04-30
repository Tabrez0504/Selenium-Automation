package DemoWebShopTestCsae;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import WorkingWithTestNG.BaseTest;

public class GiftTestCase extends BaseTest{

	@Test(groups = "System")
	public void giftTestCase() {
			driver.findElement(By.partialLinkText("Gift Cards")).click();
			
			Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Gift Cards","GiftCard page not displayed");
			Reporter.log("Navigated to Giftcards page..",true);
			
	}
}
