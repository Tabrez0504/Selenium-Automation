package WorkingwithLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithClassName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		//Locating using classname
		driver.findElement(By.className("ico-login")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		


	}

}
