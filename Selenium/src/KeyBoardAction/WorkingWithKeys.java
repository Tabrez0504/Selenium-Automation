package KeyBoardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("APjFqb")).sendKeys("MS Dhoni",Keys.ENTER);
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		

	}

}
