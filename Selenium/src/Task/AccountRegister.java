package Task;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AccountRegister {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/bankAccount.html");
		Thread.sleep(3000);
		
		driver.findElement(By.id("full_name")).sendKeys("Shaikh Tabrez");
		driver.findElement(By.id("email")).sendKeys("tabrezshaikh7624@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Tbzshaikh@123");
		driver.findElement(By.id("confirm_password")).sendKeys("Tbzshaikh@123");
		driver.findElement(By.xpath("//option[text()='Male']")).click();
		driver.findElement(By.xpath("//option[.='Savings Account']")).click();
		driver.findElement(By.xpath("//option[.='Visa']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//option[.='What is the name of your first pet?']")).click();
		driver.findElement(By.id("security_answer")).sendKeys("Daisy");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("agree_terms")).click();
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/IphoneSS.png");
		FileHandler.copy(src, trg);
		

}}
