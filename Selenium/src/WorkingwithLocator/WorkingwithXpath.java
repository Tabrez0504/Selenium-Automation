package WorkingwithLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithXpath {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/4.DemoHTML.html");
		
		Thread.sleep(2000);
		
		//by using AbsoluteXpath
		//driver.findElement(By.xpath("/html/body/fieldset/div[1]/input[1]")).sendKeys("Tabrez");
		//Thread.sleep(2000);
		
		//by using RelativeXpath
		driver.findElement(By.xpath("//div[1]//input[1]")).sendKeys("Tabrez");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//div[1]//input[2]")).sendKeys("123456");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//div[1]//input[3]")).sendKeys("dcwef3r@gmail.com");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//div[2]//input[1]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//div[3]//input[1]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//div[3]//input[2]")).click();
        Thread.sleep(2000);
        
        
		
		driver.close();
		
	}

}
