package ScrollingActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class WorkingwithScrollFromOrigin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
		
		Thread.sleep(2000);
		
		WebElement document = driver.findElement(By.id("td-section-nav"));
		
		ScrollOrigin sc = ScrollOrigin.fromElement(document);
		
		Actions act = new Actions(driver);
		act.scrollFromOrigin(sc, 0, 200).perform();
		Thread.sleep(2000);
		act.scrollFromOrigin(sc, 0, -80).perform();
		Thread.sleep(2000);
		act.scrollFromOrigin(sc, 0, -100).perform();
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
