package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginwithcss {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
	    Thread.sleep(2000);
	    
	    driver.findElement(By.className("ico-login")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.className("email")).sendKeys("sdsfgfr@gmail.com");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.className("password")).sendKeys("4235345gfg");
	    Thread.sleep(2000);
	    
        driver.findElement(By.cssSelector(".button-1.login-button")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	    
	}

}
