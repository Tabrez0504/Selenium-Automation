package WorkingwithLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithCSSSelector3 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("ascascwcw");
	    driver.findElement(By.cssSelector("#password")).sendKeys("ascwc");
	    driver.findElement(By.cssSelector("[value='Login']")).click();
	    
	    //Forward traversing from parent tag to child tag ----> '>'
	    String errorMessage=driver.findElement(By.cssSelector("div[class='error-message-container error']>h3")).getText();
	    
	    System.out.println(errorMessage);
	    
	    Thread.sleep(2000);
	    
	    driver.close();


	    
	   
	    


	    
	}

}
