package ScrollingActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(2000);
		
		WebElement emailTF = driver.findElement(By.xpath("//span[text()='Share App Link']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",emailTF);//if boolean value given false target element will be down of the page 
		Thread.sleep(2000);
		
		driver.close();

	}

}
