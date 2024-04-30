package WorkingwithLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithLinkText {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		//Locating by using Linktext
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		//Locating by using partiallinkText
		driver.findElement(By.partialLinkText("Log")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();



	}

}
