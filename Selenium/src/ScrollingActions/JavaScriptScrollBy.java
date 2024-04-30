package ScrollingActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScrollBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-800);");
		Thread.sleep(2000);
		
		driver.close();

	}

}
