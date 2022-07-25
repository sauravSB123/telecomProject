package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AddTariffPlan;
import Pages.HomePage;
import Pages.PayBilling;
import TestBase.TestBase;
import util.HandleFrame;
import util.TakescreenShot;
@Listeners(TakescreenShot.class)
public class PayBillingTest extends TestBase {
	
	HomePage homePage;
	PayBilling paybill;
	
	
	@BeforeMethod
	public void setup()

	{
		
		initialisation();
		homePage= new HomePage();
		homePage.clickPayBilling();;
		HandleFrame.Handleframe();
		paybill = new PayBilling();
		
	}
	
	@Test 
	public void Billingtest() {
		paybill.enteruserId();
		paybill.clickbillingsubmitbtn();
	}
	 
	
	@AfterMethod
	public void tearsdown() {
		driver.quit();
	}



}
