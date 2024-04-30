package PopUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithConfirmAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		//To change the driver focus
		Alert alt = driver.switchTo().alert();
        
        
        //Alert message
        System.out.println("Alert Message : "+alt.getText());
        
        //To click on cancle button
        alt.dismiss();
        Thread.sleep(2000);
        
        //To fetch result
        String result = driver.findElement(By.id("result")).getText();
        System.out.println(result);
        
        driver.close();
		
	}

}
