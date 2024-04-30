package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDemoRegister {

	
		public static void main(String[] args) {
	 	    //Step1 - Launch the browser
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demowebshop.tricentis.com/register");
			
			//Step 2 - Validate is register page is displayed
			if(driver.getTitle().equals("Demo Web Shop. Register")) {
				System.out.println("Navigated to Register Page");
			}
			else {
				System.out.println("Not Navigated to Register Page");
			}
			
			//Step 3 - Performing Registration
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.id("FirstName")).sendKeys("Tabrez");
			driver.findElement(By.id("LastName")).sendKeys("Shaikh");
			driver.findElement(By.id("Email")).sendKeys("tabrez@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Tabrezz@123");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("Tabrezz@123");
			driver.findElement(By.id("register-button")).click();
			
			//Step 4: Validate if home page is displayed
			if(driver.getCurrentUrl().contains("registerresult/1")) {
				System.out.println("Home Page is Displayed");
			}
			else {
				System.out.println("Registration Failed!!");
			}
			
			//Step 5: Close Browser
			driver.close();

	}

}
