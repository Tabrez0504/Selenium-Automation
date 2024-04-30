package Task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        
        driver.findElement(By.name("cusid")).sendKeys("qsqwsqw");
        driver.findElement(By.name("submit")).click();
        
        Alert alt = driver.switchTo().alert();
        System.out.println("Alert Message1 : "+alt.getText());
        Thread.sleep(2000);
        alt.accept();
        
        Thread.sleep(4000);
        System.out.println("Alert Message2 : "+alt.getText());
        Thread.sleep(2000);
        alt.accept();
        
        

       
        Thread.sleep(2000);
        driver.close();

	}

}
