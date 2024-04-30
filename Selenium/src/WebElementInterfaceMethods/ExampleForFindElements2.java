package WebElementInterfaceMethods;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleForFindElements2 {

	public static void main(String[] args) throws InterruptedException {
		

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println("Size :"+allLinks.size());
		
		for (WebElement links : allLinks) {
			
			System.out.println(links.getText());
			
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
