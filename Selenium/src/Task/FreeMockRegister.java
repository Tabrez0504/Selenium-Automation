package Task;

import org.openqa.selenium.By;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FreeMockRegister {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400);");
		Thread.sleep(3000);

		WebElement frameWebElement=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(frameWebElement);

		WebElement createAccountWind = driver.findElement(By.xpath("//a[@target='_blank' and contains(text(),'Free Mock Tests')]"));
		Actions act = new Actions(driver);
		act.moveToElement(createAccountWind).perform();
		Thread.sleep(3000);
		createAccountWind.click();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> Newtab = driver.getWindowHandles();
		for (String id : Newtab) {
			driver.switchTo().window(id);
			driver.getTitle();
			if(driver.getTitle().contains(""));
			{
				break;
			}
			
		}

	driver.findElement(By.xpath("/ul[@class='nav navbar-nav navbar-right']//a[text()=' Create Account']")).click();
	}
	}


