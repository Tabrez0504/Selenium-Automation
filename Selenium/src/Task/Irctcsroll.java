package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Irctcsroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,3000);");
	Thread.sleep(3000);
	
	WebElement facebookLink = driver.findElement(By.xpath("//i[@class='fa fa-facebook-f']"));
	Actions act = new Actions(driver);
	act.moveToElement(facebookLink).perform();
	Thread.sleep(3000);
	facebookLink.click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//i[@class='fa fa-youtube']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//img[@src='./assets/images/irctc-whatsapp.png']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//i[@class='fa fa-instagram']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//i[@class='fa fa-linkedin']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//i[@class='fa fa-telegram']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//i[@class='fa fa-pinterest']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//i[@class='fa fa-tumblr']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//img[@src='./assets/images/Koo.png']")).click();  //
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//i[@class='fa fa-twitter']")).click();
	Thread.sleep(3000);
	
	Set<String> allIds = driver.getWindowHandles();
	
	for(String id : allIds) {
		driver.switchTo().window(id);
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		Thread.sleep(2000);
	}

}
}
