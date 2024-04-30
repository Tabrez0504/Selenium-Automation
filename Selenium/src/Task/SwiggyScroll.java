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

public class SwiggyScroll {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.swiggy.com/");
		Thread.sleep(4000);

		WebElement location = driver.findElement(By.xpath("//div[.='Bangalore']"));

		Thread.sleep(2000);
		Actions act = new Actions(driver); 
		act.scrollToElement(location).perform();
        Thread.sleep(2000);
        
        TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/Books.png");
		FileHandler.copy(src, trg);


		driver.close();
	}

}
