package ScrollingActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithScrollingByAmount {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500).perform();//down
		Thread.sleep(2000);
		act.scrollByAmount(0, 1000).perform();//down
		Thread.sleep(2000);
		act.scrollByAmount(0, -500).perform();//Up
		Thread.sleep(2000);
		act.scrollByAmount(0, -300).perform();//Up
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
