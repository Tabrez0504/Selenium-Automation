package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapitalDragNDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.id("box1"));
		WebElement trg = driver.findElement(By.id("box101"));
		Actions act = new Actions(driver);
        act.dragAndDrop(src, trg).perform();
        Thread.sleep(1000);
		
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement UN = driver.findElement(By.id("box103"));
		act.click(Washington).release(UN).build().perform();
        Thread.sleep(1000);


		WebElement Copenhagen = driver.findElement(By.id("box4"));
		WebElement Den = driver.findElement(By.id("box104"));
		act.click(Copenhagen).release(Den).build().perform();
        Thread.sleep(1000);

		
		WebElement Rome = driver.findElement(By.id("box6"));
		WebElement Italy = driver.findElement(By.id("box106"));
		act.click(Rome).release(Italy).build().perform();
        Thread.sleep(1000);

		
		WebElement Stockholm = driver.findElement(By.id("box2"));
		WebElement Sweden = driver.findElement(By.id("box102"));
		act.click(Stockholm).release(Sweden).build().perform();
        Thread.sleep(1000);

		
		WebElement Madrid = driver.findElement(By.id("box7"));
		WebElement Spain = driver.findElement(By.id("box107"));
		act.click(Madrid).release(Spain).build().perform();
        Thread.sleep(1000);

		
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement SouthKorea = driver.findElement(By.id("box105"));
		act.click(Seoul).release(SouthKorea).build().perform();
        Thread.sleep(2000);
        
        driver.quit();

	}

}
