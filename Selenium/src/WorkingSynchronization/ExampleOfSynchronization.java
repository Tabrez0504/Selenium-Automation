package WorkingSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ExampleOfSynchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Step 1:To Launch Browser
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Step 2 :Validate
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("Navigated to OrangeHRM Page");
		}else {
			System.out.println("Not Navigated to Orange HRM Page");
		}
		
		//Step 3:Performing Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		//Step 4: validation
		if(driver.getCurrentUrl().contains("dashboard/index")) {
			System.out.println("Home Page displayed");
		}else {
			System.out.println("Login Failed");
		}
		
		//Step 5:Performing Logout and Close Browser
		driver.findElement(By.xpath("//p[text()='Vitalii was here 23VVV user']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		driver.close();
		

	}

}
