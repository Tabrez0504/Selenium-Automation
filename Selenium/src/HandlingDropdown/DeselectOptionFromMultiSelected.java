package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectOptionFromMultiSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://rakeshb13.github.io/SeleniumHTMLPages/Notification%20and%20DropDowns.html");
		
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='multiSelect']"));
		
		Select s=new Select(dropdown);
		
		//Selecting option by using index
		s.selectByIndex(3);
		Thread.sleep(1000);
		
		//Selecting option by using value
		s.selectByValue("BMW");
		Thread.sleep(1000);
		
		//Selecting option by using visible text
		s.selectByVisibleText("Mercedes-Benz");
		Thread.sleep(1000);
		
		s.deselectByVisibleText("Toyota");
		Thread.sleep(1000);
		s.deselectByIndex(2);
		Thread.sleep(1000);
		s.deselectByValue("Mercedes");
		Thread.sleep(1000);
		s.deselectByVisibleText("Audi");
		Thread.sleep(1000);
		
		
		//s.deselectAll();
		//Thread.sleep(2000);
		
		
		driver.close();

	}

}
