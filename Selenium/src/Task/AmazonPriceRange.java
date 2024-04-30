package Task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonPriceRange {

	public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		 WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		 search.sendKeys("books");
		 search.submit();
		 
		 driver.findElement(By.xpath("//span[text()='₹100 - ₹200']")).click();
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File trg=new File("./Screenshot/Books.png");
			FileHandler.copy(src, trg);
		 
		 Thread.sleep(2000);
		 
		 driver.close();

	}

}
