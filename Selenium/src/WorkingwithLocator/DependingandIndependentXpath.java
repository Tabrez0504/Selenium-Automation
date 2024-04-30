package WorkingwithLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependingandIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		 WebElement search = driver.findElement(By.name("q"));
		 search.sendKeys("Iphones");
		 search.submit();
		Thread.sleep(2000);
		
		String price=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/../..//div[@class='_30jeq3 _1_WHN1']")).getText();

		String name=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).getText();
		
		System.out.println(name+" : "+price);
		
		//to fetch diff name and price based on index
		//div[@class='_1YokD2 _3Mn1Gg']/div[4]//div[@class='_4rR01T'
		
		driver.close();
	}

}
