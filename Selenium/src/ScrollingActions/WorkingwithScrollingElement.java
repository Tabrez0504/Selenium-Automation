package ScrollingActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithScrollingElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//span[text()='Share App Link']"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(button).perform();
		
		driver.close();

	}

}
