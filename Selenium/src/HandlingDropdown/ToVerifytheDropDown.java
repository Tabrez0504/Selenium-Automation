package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifytheDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://rakeshb13.github.io/SeleniumHTMLPages/Notification%20and%20DropDowns.html");
		
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='multiSelect']"));
		
		Select s=new Select(dropdown);
		
		if(s.isMultiple())
		{
			System.out.println("It is a Multi Select dropdown");
		}
		else
		{
			System.out.println("It is a Single Select dropdown");

		}
		Thread.sleep(2000);
		
		driver.close();

	}

}
