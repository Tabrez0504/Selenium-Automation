package ScrollingActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScrollTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1200);");//down
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,300);");//up
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,1800);");//down
		Thread.sleep(2000);
		
		driver.close();

	}

}
