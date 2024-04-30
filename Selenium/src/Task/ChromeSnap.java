package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSnap {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
			
	        driver.manage().window().maximize();
			
			driver.get("https://accounts.snapchat.com/accounts/v2/login");
			
			Thread.sleep(3000);
			
			driver.close();
	}

}
