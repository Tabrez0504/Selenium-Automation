package WorkingWithTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WokingWithDataProvider {

	@Test(dataProvider = "SampleTestData")
	public void testCase(String email,String password) throws InterruptedException
	{
		System.out.println(email+" - "+password);
		Thread.sleep(3000);
	}
	
	@DataProvider(name = "SampleTestData")
	public Object[][] dataSupply()
	{
		Object[][] arr = new Object[3][2];
		arr[0][0] = "Admin1@gmail.com";
		arr[0][1] = "Password1";
		arr[1][0] = "Admin2@gmail.com";
		arr[1][1] = "Password2";
		arr[2][0] = "Admin3@gmail.com";
		arr[2][1] = "Password3";
		
		return arr;
	}
}
