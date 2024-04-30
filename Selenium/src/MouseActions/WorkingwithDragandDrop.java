package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.id("box1"));
		WebElement trg = driver.findElement(By.id("box101"));
		
		Actions act = new Actions(driver);
		
		//To- perform drag and drop from src to trg
		
		act.dragAndDrop(src, trg).perform();
		
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement UN = driver.findElement(By.id("box103"));
		
		//Multiple methods to perform drag and drop
		act.click(Washington).release(UN).build().perform();
		//act.click(Washington).moveToElement(UN).release().perform();
		//act.moveToElement(Washington).clickAndHold().moveToElement(UN).release().perform();
		
		
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
