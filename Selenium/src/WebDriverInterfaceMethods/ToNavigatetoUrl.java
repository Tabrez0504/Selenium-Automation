package WebDriverInterfaceMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigatetoUrl {

	public static void main(String[] args) {
		
		
		//To Launch the browser
		WebDriver driver = new ChromeDriver();
		
		
		//To navigate to URL
		driver.get("https://www.zomato.com/bangalore/order-food-online");
		
		
	}

}
