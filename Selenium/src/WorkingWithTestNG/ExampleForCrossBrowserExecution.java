package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExampleForCrossBrowserExecution {

	WebDriver driver;
	
	@Parameters("Browsername")
	@Test
	public void testCase(String browserName) throws InterruptedException
	{

		if(browserName.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Enter a Valid Browser Name");
		}
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
	}
}
