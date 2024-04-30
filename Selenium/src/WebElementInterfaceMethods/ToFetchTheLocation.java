package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchTheLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://sso.godaddy.com/");
		
		Thread.sleep(2000);
		
		WebElement signInButton = driver.findElement(By.id("submitBtn"));
		
		//To fetch the location of Web Element
		
		Point location = signInButton.getLocation();
		System.out.println("Location : "+location);
		System.out.println("X : "+location.getX());
		System.out.println("Y : "+location.getY());
		
		//To fetch the size of the Web Element
		Dimension size = signInButton.getSize();
		System.out.println("Size : "+size);
		System.out.println("Height :"+size.getHeight());
		System.out.println("Width :"+size.getHeight());
		
		Thread.sleep(2000);

		driver.close();
		
		

	}

}
