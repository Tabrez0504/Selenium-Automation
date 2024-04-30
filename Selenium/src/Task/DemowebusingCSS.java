package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebusingCSS {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("[class='ico-register']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[id='gender-male']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#FirstName")).sendKeys("Tabree");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#LastName")).sendKeys("Shasikh");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("sawe@gamil.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("3124635");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("3124635");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#register-button")).click();
		Thread.sleep(2000);
		
		String txt = driver.findElement(By.cssSelector("[class='result']")).getText();
		
		System.out.println(txt);
		
		driver.close();
		
		
		
		
		
		
	}

}
