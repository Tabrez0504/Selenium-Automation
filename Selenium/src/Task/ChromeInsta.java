package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeInsta {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
