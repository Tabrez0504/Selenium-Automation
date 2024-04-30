package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperstackusingCss {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://shoppersstack.com/");
			Thread.sleep(30000);
			driver.findElement(By.cssSelector("[id='loginBtn']")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[id='Create Account']")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[id='First Name']")).sendKeys("Tabrez");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[id='Last Name']")).sendKeys("Shaikh");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[id='Male']")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[id='Phone Number']")).sendKeys("123456789");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[id='Email Address']")).sendKeys("tabrezshaikh7624@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[id='Password']")).sendKeys("123456878");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[id='Confirm Password']")).sendKeys("123456878");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[id='Terms and Conditions']")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[id='Register']")).click();
			Thread.sleep(3000);
		
	}

}
