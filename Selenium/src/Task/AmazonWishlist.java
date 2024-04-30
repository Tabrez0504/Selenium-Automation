package Task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AmazonWishlist {

	public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		WebElement Account = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions act = new Actions(driver);
		act.moveToElement(Account).perform();
		Thread.sleep(2000);
		
		WebElement Wishlist = driver.findElement(By.xpath("//span[text()='Your Wish List']"));
		act.click(Wishlist).perform();
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/Wishlist.png");
		FileHandler.copy(src, trg);
		
		Thread.sleep(2000);
		driver.quit();

	}

}
