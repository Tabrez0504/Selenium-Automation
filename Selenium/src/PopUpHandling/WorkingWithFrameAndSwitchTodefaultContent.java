package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrameAndSwitchTodefaultContent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(3000);
		WebElement frameWebElement = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		driver.switchTo().frame(frameWebElement);
		driver.findElement(By.id("b-query")).sendKeys("Books");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("selenium143")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
