package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
			
	        driver.manage().window().maximize();
			
			driver.get("https://www.iplt20.com/");
			
			Thread.sleep(2000);
			

			WebElement news = driver.findElement(By.xpath("//ul[contains(@class,'site-m')]//a[text()='NEWS']"));
			Actions act = new Actions(driver);
			
			//To mouse over on the elements
			act.moveToElement(news).perform();
			Thread.sleep(2000);
			
			WebElement matchreport = driver.findElement(By.xpath("//*[@id=\"myHeader\"]/div/div[3]/div/div/nav/ul/li[6]/ul/li[3]/a"));
			act.moveToElement(matchreport).perform();
			
			Thread.sleep(2000);
			
			act.click(matchreport).perform();
			Thread.sleep(2000);
			
			driver.close();
	}

}
