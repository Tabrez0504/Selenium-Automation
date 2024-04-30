package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionfronSingleSelectDD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.id("drop1"));
		
		Select s=new Select(dropdown);
		
		//Selecting option by using index
		s.selectByIndex(3);
		Thread.sleep(1000);
		
		//Selecting option by using value
		s.selectByValue("def");
		Thread.sleep(1000);
		
		//Selecting option by using visible text
		s.selectByVisibleText("Older Newsletters");
		Thread.sleep(1000);
		
		//To fetch all option
		List<WebElement> allOptions = s.getOptions();
		
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
			
		}
		
		driver.close();
		

	}

}
