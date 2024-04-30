package PopUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(2000);
		
		//To change the driver focus
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(2000);
        
        //Fetch
        Alert alt = driver.switchTo().alert();
        
        
        String altMessage=alt.getText();
        System.out.println("Alert Message : "+altMessage);
        
        alt.accept();
        Thread.sleep(2000);
        
        String result = driver.findElement(By.id("result")).getText();
        System.out.println(result);
        
        driver.close();
	}

}
