package WorkingwithLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WprkingwithXpathbyForwardTraversing {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapchat.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='ConsumerNav_linkList__uhDqu']/li[2]")).click();
		
		//driver.findElement(By.xpath("//ul[@class='ConsumerNav_linkList__uhDqu']//span[text()='Spotlight']")).click();

		
		if(driver.getTitle().equals("Spotlight"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.close();
	}

}
