package WorkingWithRelativeLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class WorkingwithBelowWebElement {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books",Keys.ENTER);
		
		
		By target = By.xpath("//span[@class='a-price-whole']");
		By ref = By.xpath("//div[@class='a-section']//span[text()='Think Like a Monk 1st edition - Train your M']");
		
		String productPrice = driver.findElement(RelativeLocator.with(target).below(ref)).getText();
		
		String productName = driver.findElement(ref).getText();
		
		System.out.println(productName+" - "+productPrice);
		
		driver.close();

	}
	

}
