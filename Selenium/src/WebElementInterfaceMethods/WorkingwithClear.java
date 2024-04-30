package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithClear {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		Thread.sleep(2000);
		
	   WebElement userNameTextField=driver.findElement(By.id("username"));
		
		//Used to clear the value present in the text field.
	   
	   userNameTextField.clear();
	   Thread.sleep(2000);
	   userNameTextField.sendKeys("Tabrez");
	   
	   WebElement passwordTextField=driver.findElement(By.id("password"));
        passwordTextField.clear();
	   Thread.sleep(2000);
	   passwordTextField.sendKeys("Tabrez@123");
	   
	   driver.close();
	   
	   
	}

}
