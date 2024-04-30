package PopUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPrompAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);

		//To pass the value to alert text field
	    driver.switchTo().alert().sendKeys("Hi FireFlink");
        
        
		driver.switchTo().alert().accept();
        Thread.sleep(2000);
        
        //To fetch result
        String result = driver.findElement(By.id("result")).getText();
        System.out.println("Result : "+result);
        
        Thread.sleep(2000);
        driver.close();
		

	}

}
