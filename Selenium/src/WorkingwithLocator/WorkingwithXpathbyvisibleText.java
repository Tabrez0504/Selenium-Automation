package WorkingwithLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithXpathbyvisibleText {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		//Xpath by visible text 
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();

		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.close();
	}

}
