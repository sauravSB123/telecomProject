package TestCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AddCustomer;
import Pages.HomePage;
import TestBase.TestBase;
import util.HandleFrame;

public class AddCustomerTest extends TestBase {
	
	HomePage homePage;
	HandleFrame handleFrame;
	AddCustomer addCustomer;
	

	public AddCustomerTest()  {
		super();
		
	}
	
	
	
	@BeforeMethod
	public void setup()
	{
		initialisation();
	    homePage = new HomePage();
	    handleFrame = new HandleFrame();
		addCustomer = new AddCustomer();
	
	
		
	}
	
	
	@Test ( priority = 2)
	public void addCustomerTest() throws InterruptedException
	{	
		  homePage.clickAddCustomer();
		  handleFrame.Handleframe();
		  addCustomer.registerDetails();
		
	}
	@Test( priority = 1)
	public void verifyLogo()
	{
		homePage.clickAddCustomer();
	 boolean flag =	addCustomer.guruLogo();
		Assert.assertTrue(flag);
		
	}
	
	

	

}
