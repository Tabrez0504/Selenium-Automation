package PopUpHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkingWithNotification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(opt);
		
        driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
