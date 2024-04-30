package WorkingSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExampleForExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.shoppersstack.com/products_page/7");
		
		String productTitle = driver.findElement(By.xpath("//h4[text()='Levis Mens Regular Fit Tee']")).getText();
        String productPrice = driver.findElement(By.xpath("//p[@class='CalculateOffer_wrapper__2XD4R']")).getText();

        		System.out.println("Product Title : "+productTitle);
        		System.out.println("Product Price : "+productPrice);
        		
        		driver.findElement(By.id("Check Delivery")).sendKeys("560037");
        		
        		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
        		
        		driver.findElement(By.id("Check")).click();
        		String resultMessage = driver.findElement(By.id("Check Delivery-helper-text")).getText();
        		System.out.println(resultMessage);
        		
        		driver.close();
	}

}
