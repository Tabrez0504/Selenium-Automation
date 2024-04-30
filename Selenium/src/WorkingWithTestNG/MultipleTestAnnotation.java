package WorkingWithTestNG;

import org.testng.annotations.Test;

public class MultipleTestAnnotation {
	@Test(priority = 1)
	public void regiter()
	{
		System.out.println("Registeration Done..");
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("Login Done..");
	}
	
	@Test(priority = 3 , enabled = false)
	public void addToCart()
	{
		System.out.println("Product Added To Cart Done..");
	}
	
	@Test(priority = 4)
	public void placeOrder()
	{
		System.out.println("Order Placed..");
	}
	
	@Test(priority = 5)
	public void logout()
	{
		System.out.println("Logout Done..");
	}





}
