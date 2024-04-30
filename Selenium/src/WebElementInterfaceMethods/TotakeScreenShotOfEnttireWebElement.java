package WebElementInterfaceMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TotakeScreenShotOfEnttireWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/");
		
		Thread.sleep(2000);
		
		WebElement logo = driver.findElement(By.xpath("//span[@class='default-ltr-cache-0 ev1dnif0']"));
		
		File src = logo.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshot/netflix.png");
		FileHandler.copy(src, trg);
		
		driver.close();
		
	}

}
