package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithFrameIdName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.dream11.com/");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 300).perform();
		Thread.sleep(2000);
		
		//change the driver focus by using id Attribute value
		driver.switchTo().frame("send-sms-iframe");
		
		driver.findElement(By.id("regEmail")).sendKeys("8249719793");
		
		Thread.sleep(2000);
		driver.close();

	}

}
