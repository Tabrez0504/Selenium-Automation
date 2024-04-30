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
import org.openqa.selenium.support.ui.Select;

public class CruiseScreenshotDD {

	public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cruises.via.com/");
		
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.name("place"));
		Select s=new Select(dropdown);
		s.selectByIndex(11);
		Thread.sleep(1000);
		
		WebElement dropdown1 = driver.findElement(By.name("sailDate"));
		Select d=new Select(dropdown1);
		d.selectByIndex(9);
		Thread.sleep(1000);
		
		WebElement dropdown2 = driver.findElement(By.name("duration"));
		Select date=new Select(dropdown2);
		date.selectByIndex(1);
		Thread.sleep(1000);
		
//		driver.findElement(By.id("fightTravellersClass")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='btn bg-light-4'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[text()='Done']")).click();
//		Thread.sleep(1000);
		
		WebElement dropdown4 = driver.findElement(By.name("cruise"));
		Select cru=new Select(dropdown4);
		cru.selectByIndex(3);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Search Cruise']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#closeWaiting")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/Cruise.png");
		FileHandler.copy(src, trg);
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
