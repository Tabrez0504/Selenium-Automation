package WorkingwithLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithCSSSelector {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//To search----->Ctrl+f
		//[A_N='A_V']
		//tagname[A_N='A_V']
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("tabrezshaikh7624@gmail.com");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("tabrezshaikh7624@gmail.com");

		Thread.sleep(3000);
		driver.close();
		
		
	}

}
