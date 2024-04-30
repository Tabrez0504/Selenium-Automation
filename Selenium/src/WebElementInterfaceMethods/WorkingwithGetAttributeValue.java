package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGetAttributeValue {

	public static void main(String[] args) throws InterruptedException {
		
		String username = "Tabrez";
		String password = "tabrez@1234";
		
		
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sso.godaddy.com/");
		
		Thread.sleep(2000);
		
		WebElement userNameTF = driver.findElement(By.id("username"));
		userNameTF.sendKeys(username);
		WebElement passwordTF = driver.findElement(By.id("password"));
		passwordTF.sendKeys(password);
		
		System.out.println(userNameTF.getAttribute("value"));
		System.out.println(passwordTF.getAttribute("value"));
		
		if(userNameTF.getAttribute("value").equals(username))
		{
			System.out.println("Username TF is Accepting the value");
		}else
		{
			System.out.println("Username TF is not Accepting the value");
		}
		
		driver.close();

		
	}

}
