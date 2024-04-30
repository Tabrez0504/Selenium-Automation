package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
			
	        driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			Thread.sleep(2000);
			
			WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
			
			Actions act=new Actions(driver);
			
			//To perform right click
			act.contextClick(rightClick).perform();
			Thread.sleep(2000);
			
			driver.close();
			

	}

}
