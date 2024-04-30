package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeShop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new EdgeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.shopify.com/in/free-trial/3-steps?term=shopify&adid=566014743975&campaignid=15433369407&branded_enterprise=1&BOID=brand&utm_medium=cpc&utm_source=google&gad_source=1&gclid=EAIaIQobChMIvfbFpI6NhQMVqiZ7Bx2NzgIoEAAYASAAEgLXivD_BwE&cmadid=516585705;cmadvertiserid=10730501;cmcampaignid=26990768;cmplacementid=324494758;cmcreativeid=163722649;cmsiteid=5500011");
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
