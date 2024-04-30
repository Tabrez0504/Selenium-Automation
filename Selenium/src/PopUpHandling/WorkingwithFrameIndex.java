package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithFrameIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		String message = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
		System.out.println("Frame WebElement : "+message);
		
		driver.close();
	}
	

}
