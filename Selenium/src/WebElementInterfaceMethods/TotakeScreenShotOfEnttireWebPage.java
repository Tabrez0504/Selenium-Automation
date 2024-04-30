package WebElementInterfaceMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TotakeScreenShotOfEnttireWebPage {

	public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://in.pinterest.com/pin/itachi-uchiha--486248091030514734/");
		
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/Itachi.png");
		FileHandler.copy(src, trg);
		
		Thread.sleep(2000);
		driver.close();

	}

}
