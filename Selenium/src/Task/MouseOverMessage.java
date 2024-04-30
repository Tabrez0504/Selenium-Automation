package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseOverMessage {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		 //1
		 WebElement search = driver.findElement(By.name("q"));
		 System.out.println("Mouse over SearchBar :"+search.getAttribute("title"));
		 
		//2
		 WebElement login = driver.findElement(By.cssSelector("._1TOQfO"));
		 System.out.println("Mouse over Login :"+login.getAttribute("title"));
		 
		//3
		 WebElement Cart = driver.findElement(By.cssSelector("._3RX0a-"));
		 System.out.println("Mouse over Cart :"+Cart.getAttribute("title"));
		 
		//4
		 WebElement Seller = driver.findElement(By.cssSelector("._3RX0a-._3jeYYh"));
		 System.out.println("Mouse over Seller :"+Seller.getAttribute("title"));
		 
		//5
		 WebElement Dropdown = driver.findElement(By.cssSelector("._1TOQfO"));
		 System.out.println("Mouse over Dropdown :"+Dropdown.getAttribute("title"));
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
