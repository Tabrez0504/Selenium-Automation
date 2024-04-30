package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExampleForTestAnotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
			
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.flipkart.in/");
			
			System.out.println(driver.getTitle());
			driver.close();

	}
	
	  @Test
			public void testcas()
			{

		    WebDriver driver=new ChromeDriver();
			
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in/");
			
			System.out.println(driver.getTitle());
			driver.close();

			
		}

}
