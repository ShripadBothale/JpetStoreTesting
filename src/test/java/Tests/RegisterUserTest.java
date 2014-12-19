package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RegisterUserTest {

	@Test
	public void RegisterUserTestCase ()
	{
		WebDriver driver = new FirefoxDriver();
		String baseurl = "http://localhost:8081/JPetStoreApp";
		driver.get(baseurl);
		String userName = "Test";
		String password = "Test@123";
		driver.manage().window().maximize();
		String expectedTitle = "Welcome to JPetStore 6";
		 String actualTitle = "";
		 actualTitle = driver.getTitle(); 
	        
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {

	        }
	        driver.findElement(By.xpath("//*[text()='Enter the Store']")).click();
	        driver.findElement(By.xpath("//*[text()='Sign In']")).click();
	        driver.findElement(By.xpath("//*[text()='Register Now!']")).click();
	        driver.findElement(By.xpath("//*[@name='username']")).sendKeys(userName);
	        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
	        driver.findElement(By.xpath("//*[@name='repeatedPassword']")).sendKeys(password);
	        driver.findElement(By.xpath("//*[@name='account.firstName']")).sendKeys(userName);
	        driver.findElement(By.xpath("//*[@name='account.lastName']")).sendKeys(userName);
	        driver.findElement(By.xpath("//*[@name='account.address1']")).sendKeys(userName);
	        driver.findElement(By.xpath("//*[@name='account.address2']")).sendKeys(userName);
	        driver.findElement(By.xpath("//*[@name='account.city']")).sendKeys(userName);
	        driver.findElement(By.xpath("//*[@name='account.state']")).sendKeys(userName);
	        driver.findElement(By.xpath("//*[@name='account.zip']")).sendKeys(userName);
	        driver.findElement(By.xpath("//*[@name='account.country']")).sendKeys(userName);
	        driver.findElement(By.xpath("//*[@name='newAccount']")).click();
	       	        
	        
	      //driver.quit();
	}
	
}
