package WorkingWithRelativeLocator;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToOpwnNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		
		System.out.println("EaseMyTrip : "+driver.getTitle());
		
		Thread.sleep(2000);
		
		//To Open anew tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		System.out.println("Myntra : "+ driver.getTitle());
		Thread.sleep(2000);
		
		//To open a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.flipkart.com/");
		System.out.println("Flipkart : "+driver.getTitle());
		
		Thread.sleep(2000);
		driver.quit();
				
				

	}

}
