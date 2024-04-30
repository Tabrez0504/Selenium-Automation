package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();		
        driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
