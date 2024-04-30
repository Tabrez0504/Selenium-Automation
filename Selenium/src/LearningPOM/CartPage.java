package LearningPOM;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(name = "removefromcart")
	private List<WebElement> removeFromCart;
	
	@FindBy(name = "updatecart")
	private WebElement updateCart;
	
	@FindBy(name = "continueshopping")
	private WebElement continueShopping;
	
	public CartPage(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getRemoveFromCart() {
		return removeFromCart;
	}

	

	public WebElement getUpdateCart() {
		return updateCart;
	}



	public WebElement getContinueShopping() {
		return continueShopping;
	}

	
	
	

}
