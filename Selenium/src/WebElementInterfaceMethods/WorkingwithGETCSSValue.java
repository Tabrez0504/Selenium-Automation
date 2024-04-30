package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGETCSSValue {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/user-signin");
		
		Thread.sleep(15000);
		
		driver.findElement(By.id("Email")).sendKeys("dhihi@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("hvuguni");
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		
		WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Given')]"));
		
		System.out.println(errorMessage.getText());
		
		//to fetch the color
		String color = errorMessage.getCssValue("color");
		System.out.println(color);
		
		//to fetch the font
		String font = errorMessage.getCssValue("font");
		System.out.println(font);
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
