package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWhtsapp {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://web.whatsapp.com/");
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
