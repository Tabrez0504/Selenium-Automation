package KeyBoardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
			
	        driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			
			Thread.sleep(2000);
			
			driver.findElement(By.partialLinkText("Book")).click();
			Thread.sleep(2000);
			WebElement dropdown = driver.findElement(By.id("products-orderby"));
			Select s=new Select(dropdown);
			
			for(int i = 0;i <=5; i++)
			{
				System.out.println("I : "+i);
				s.selectByIndex(i);
				Thread.sleep(2000);
				dropdown=driver.findElement(By.id("products-orderby"));
				s=new Select(dropdown);
			}
			
			Thread.sleep(2000);
			driver.close();
			
			//Stale Exception
			
			
			
			
			
	}

}
