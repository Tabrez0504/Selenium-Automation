package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlinkItScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.blinkit.com/");
		
		Thread.sleep(2000);
		
//		driver.findElement(By.name("select-locality")).sendKeys("Bengaluru, Karnataka, India");	
//		Thread.sleep(2000);
		
		WebElement news = driver.findElement(By.name("Bengaluru, Karnataka, India"));
		Actions act = new Actions(driver);
		act.moveToElement(news).perform();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,2300);");
		Thread.sleep(2000);
		
		


		driver.close();
	}

}
