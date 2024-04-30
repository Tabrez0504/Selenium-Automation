package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Barbequefetchtabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.barbequenation.com/");
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,2800);");
	Thread.sleep(3000);
		
		WebElement facebookLink = driver.findElement(By.xpath("//span[@class='fa fa-facebook fa-lg']"));
		Actions act = new Actions(driver);
		act.moveToElement(facebookLink).perform();
		Thread.sleep(3000);
		facebookLink.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='fa fa-twitter fa-lg']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='fa fa-instagram fa-lg']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='fa fa-youtube fa-lg']")).click();
		Thread.sleep(3000);
		
		Set<String> allIds = driver.getWindowHandles();
		
		for(String id : allIds) {
			driver.switchTo().window(id);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
		}
		driver.close();
		
	}

}
