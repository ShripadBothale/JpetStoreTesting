package Tests;


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
		driver.manage().window().maximize();
		String expectedTitle = "Welcome to JPetStore 6";
		 String actualTitle = "";
		 actualTitle = driver.getTitle(); 
	        
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {

	        }
	        driver.quit();
	        
	}
	
}
