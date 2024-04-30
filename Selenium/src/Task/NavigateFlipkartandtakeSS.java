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

public class NavigateFlipkartandtakeSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		 WebElement search = driver.findElement(By.name("q"));
		 search.sendKeys("Iphones");
		 search.submit();
		Thread.sleep(2000);
		
		String name=driver.findElement(By.xpath("//div[@class='_4rR01T']")).getText();

		String price=driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText();
		
		System.out.println("Name of the Phone: "+name);
		
		System.out.println("Price of the Phone: "+price);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/IphoneSS.png");
		FileHandler.copy(src, trg);
		
		Thread.sleep(2000);
		driver.close();

	}

}
