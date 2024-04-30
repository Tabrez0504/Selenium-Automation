package ScrollingActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingHorizontal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.scrollByAmount(800, 0).perform();//right
		Thread.sleep(2000);
		act.scrollByAmount(500,0).perform();//right
		Thread.sleep(2000);
		act.scrollByAmount(-800,0).perform();//left
		Thread.sleep(2000);
		act.scrollByAmount(-700, 0).perform();//left
		Thread.sleep(2000);
		
		driver.quit();
	}

}
