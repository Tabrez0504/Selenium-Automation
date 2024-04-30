package WorkingWithRelativeLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRightWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		
		
		driver.findElement(By.name("q")).sendKeys("Iphones",Keys.ENTER);
		
		WebElement productNameDef = driver.findElement(By.xpath("//div[text()='Apple iphone 15 (Pink, 128 GB)']"));
		
	}

}
