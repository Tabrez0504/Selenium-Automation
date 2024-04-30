package LearningPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionFXPage {
	
	@FindBy(id = "add-to-wishlist-button-78")
	private WebElement addToWishlist;

	public FictionFXPage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToWishlist() {
		return addToWishlist;
	}

	
	
}
