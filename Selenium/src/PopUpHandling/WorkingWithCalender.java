package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]"));
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
