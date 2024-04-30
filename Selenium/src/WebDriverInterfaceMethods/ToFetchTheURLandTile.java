package WebDriverInterfaceMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchTheURLandTile {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/bangalore/order-food-online");
         
		//To fetch the title of webpage
		String title = driver.getTitle();
		
		//To get url of webpage
		String url = driver.getCurrentUrl();
		
		System.out.println("Title : "+title);
		System.out.println("URL : "+url);
		
		//To  close the browser
		driver.close();

	}

}
