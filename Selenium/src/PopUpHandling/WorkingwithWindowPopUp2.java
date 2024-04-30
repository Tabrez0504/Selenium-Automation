package PopUpHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithWindowPopUp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
        driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/Multiple%20Windows.html");
		Thread.sleep(3000);
		
		WebElement open = driver.findElement(By.xpath("//*[@id=\"open-windows-button\"]"));
		
		
		open.click();
		System.out.println(driver.getTitle());
		Set<String> allIds = driver.getWindowHandles();
		
		System.out.println(allIds);
		
		for(String id:allIds) {
			driver.switchTo().window(id);
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
	}
		driver.quit();
	}
}


