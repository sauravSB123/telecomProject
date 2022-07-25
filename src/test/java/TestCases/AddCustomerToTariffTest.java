package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AddCustomer;
import Pages.AddCustomerToTarriffPlan;
import Pages.ApprovedTariffPlan;
import Pages.HomePage;
import TestBase.TestBase;
import util.HandleFrame;
import util.TakescreenShot;
@Listeners(TakescreenShot.class)
public class AddCustomerToTariffTest extends TestBase {
	
	
	HomePage homePage;
	HandleFrame handleFrame;
	AddCustomerToTarriffPlan addtffplan;
	ApprovedTariffPlan approvedtffplan;
	

	public AddCustomerToTariffTest(){
		super();
	}
	
	
	
	@BeforeMethod
	public void setup()
	{
		initialisation();
	    homePage = new HomePage();
	    homePage.clickaddCustomertoTariff();
	    handleFrame = new HandleFrame();
	    handleFrame.Handleframe();
	    addtffplan = new AddCustomerToTarriffPlan();
	   // approvedtffplan = new 	ApprovedTariffPlan();
	    
	}
	
	
	@Test(priority=1)
	public void logoverifyTest()
	{
		boolean flag = addtffplan.verifyLogo();
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	@Test
	public void logoverifyTest1()
	{
		boolean flag = addtffplan.verifyLogo();
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	@Test
	public void logoverifyTest2()
	{
		boolean flag = addtffplan.verifyLogo();
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	
	//public void enterCustId() throws InterruptedException
	//{
		//addtffplan.clicToEnterCustId();
		
		
		//approvedtffplan.clickApprovedTariffPlan();
		
	//}
	
	
	
	
	


}
