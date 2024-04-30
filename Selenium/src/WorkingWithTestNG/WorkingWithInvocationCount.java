package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithInvocationCount {

	

		@Test(invocationCount = 10 , threadPoolSize = 5)
		public void bookMyShowTestCase() throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
			
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			
			driver.close();
	}
}


