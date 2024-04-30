package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperstackusingXpath {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/article/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
