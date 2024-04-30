package LearningPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsPage {
	
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private List<WebElement> addToCart;
	
	public DigitalDownloadsPage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getAddToCart() {
		return addToCart;
	}

	

	
}
