package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFileUploadSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(2000);
		
		WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register now']"));
		
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",registerButton);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("‪C:\\Users\\User\\Downloads\\sunny notes (1).pdf");
	}

}
