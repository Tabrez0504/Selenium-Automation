package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithSubmit {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		WebElement searchTextField = driver.findElement(By.name("q"));
		searchTextField.sendKeys("Iphone");
		Thread.sleep(2000);
		
		//Used to perform click action -type="submit"
		searchTextField.submit();
		Thread.sleep(5000);
		
		driver.close();
	}

}
