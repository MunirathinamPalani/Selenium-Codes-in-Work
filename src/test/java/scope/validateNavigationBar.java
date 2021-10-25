package scope;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import resources.base;

public class validateNavigationBar extends base{
	public WebDriver driver;
@BeforeTest
public void initialize() throws IOException
{
	
	 driver =initializeDriver();	
	driver.get(prop.getProperty("url"));
}
	@Test
	public void validateAppNavBar() throws IOException
	{
		LandingPage l=new LandingPage(driver);
	    Assert.assertTrue(l.getNavigationBar().isDisplayed());
		System.out.println("Test completed");
		}
	
@AfterTest
public void teardown()
{	
	driver.close();	
}

	
}
