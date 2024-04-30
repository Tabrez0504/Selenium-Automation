package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FetchModelAndPrice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/WebTable.html");
		Thread.sleep(3000);

		List<WebElement> allModels = driver.findElements(By.className("model"));
		// To fetch the size of models
		System.out.println("Model Nos.:" +allModels.size());
		// To fetch the name of the models
		for(WebElement model: allModels) {
			System.out.println(model.getText());
		}

		List<WebElement> allPrice = driver.findElements(By.className("price"));
		// To fetch the size of prices
		System.out.println("Price.:" +allPrice.size());
		// To fetch the prices of all models
		for(WebElement price: allModels) {
			System.out.println(price.getText());
		}


		driver.close();

	}

}
