package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AddTariffPlan;
import Pages.HomePage;
import TestBase.TestBase;
import util.HandleFrame;

public class AddtariffPlanTest extends TestBase {
	
	
	
	HomePage homePage;
	
	AddTariffPlan addTariffPlan;
	
	@BeforeMethod
	public void setup()

	{
		
		initialisation();
		homePage= new HomePage();
		homePage.clickAddTariffplan();
		HandleFrame.Handleframe();
		addTariffPlan = new AddTariffPlan();
		
	}
	
	
	@Test
	public void enterTariffPlan()
	{
		
		addTariffPlan.enterTariffDetails();
		
		driver.findElement(By.xpath("/html/body/section/div/ul/li/a")).click();
	}
	
	

}
