package WebElementInterfaceMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatetoStringURL {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();

        String expTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		driver.manage().window().maximize();
		
		//To Navigate the URL
		driver.navigate().to("https://www.flipkart.com/");
		
		//URL url=new URL("https://www.flipkart.com/");
		//driver.navigate().to(url);
		
		Thread.sleep(2000);
		
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(expTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		
		
	}

}
