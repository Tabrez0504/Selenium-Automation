package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExampleForParallelExecution {

	@Test
	public void exapmle() throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.honda2wheelersindia.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
			}
	
	@Test
	public void example2() throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ktmindia.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
	}
}
