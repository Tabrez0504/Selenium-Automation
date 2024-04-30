package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablenames {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.woodenstreet.com/");
			Thread.sleep(3000);

					driver.findElement(By.id("search-user1")).sendKeys("Study Tables");
					driver.findElement(By.name("serach")).click();
					Thread.sleep(2000);

			List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
			// Size
			System.out.println("Size:" +allLinks.size());

			for(WebElement link: allLinks) {
				System.out.println(link.getText());
			}
			driver.close();


	}

}
