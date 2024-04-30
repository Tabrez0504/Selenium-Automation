package PopUpHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);

		WebElement twiitterLink = driver.findElement(By.xpath("//a[text()='Twitter']"));
		Actions act = new Actions(driver);
		act.moveToElement(twiitterLink).perform();
		Thread.sleep(2000);
		
		twiitterLink.click();
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		Thread.sleep(2000);
		Set<String> allIds = driver.getWindowHandles();
		System.out.println("Size : "+allIds.size());
		
		for(String id : allIds)
		{
			driver.switchTo().window(id);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}

}
