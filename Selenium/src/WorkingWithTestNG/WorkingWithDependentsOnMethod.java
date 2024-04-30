package WorkingWithTestNG;

import org.testng.annotations.Test;

public class WorkingWithDependentsOnMethod {

	@Test
	public void wishlisttestCase()
	{
		System.out.println("Product added to Wishlist...");
	}
	
	@Test(dependsOnMethods = "wishlisttestCase")
	public void removewishlisttestCase()
	{
		System.out.println("Product removed from the Wishlist...");
	}
}
