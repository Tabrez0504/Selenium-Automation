package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithVerifyMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/AllExamples.html");
		
		Thread.sleep(2000);
		
		WebElement passwordTF = driver.findElement(By.name("Password"));
		System.out.println("Password text Field :"+passwordTF.isDisplayed());
		
		WebElement checkBox = driver.findElement(By.id("Checkbox1"));
		checkBox.click();
		System.out.println("ChechBox :"+checkBox.isSelected());
		
		WebElement displayedButton = driver.findElement(By.xpath("//button[text()='Disabled Button']"));
		System.out.println("Disabled button :"+displayedButton.isEnabled());
		
		driver.close();
	}

}
