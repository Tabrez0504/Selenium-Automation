package WebDriverInterfaceMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeTheBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/bangalore/order-food-online");
        driver.close();

	}

}
