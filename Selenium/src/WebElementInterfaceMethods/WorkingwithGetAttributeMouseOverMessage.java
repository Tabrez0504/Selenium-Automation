package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGetAttributeMouseOverMessage {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			Thread.sleep(2000);
			
			WebElement searchTf = driver.findElement(By.id("APjFqb"));
			searchTf.sendKeys("MSD");
			
			System.out.println("Value :"+searchTf.getAttribute("value"));
			
			System.out.println("Mouse over Message :"+searchTf.getAttribute("title"));

			Thread.sleep(2000);
			
			driver.close();
			
	}

}
