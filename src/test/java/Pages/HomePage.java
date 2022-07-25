package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class HomePage extends TestBase {
	
	 AddCustomer addcustomerobj = new AddCustomer();
	 PayBilling payBilling_obj = new PayBilling();
	 AddCustomerToTarriffPlan addCustomerToTariff_obj = new AddCustomerToTarriffPlan();
	 AddTariffPlan addtarriffplan_obj =new AddTariffPlan();
	 
	 
	
	@FindBy(xpath ="//div[@class='flex-item left']//div//h3//a[@href='addcustomer.php'][normalize-space()='Add Customer']")
	WebElement addCustomer_el;
	
	@FindBy(xpath ="//a[normalize-space()='Add Tariff Plan']")
	WebElement tariffPlan_el;
	
	@FindBy(xpath ="//div[@class='flex-item left']//div//h3//a[@href='assigntariffplantocustomer.php'][normalize-space()='Add Tariff Plan to Customer']")
	WebElement addcustomerToTariff_el;
		
	@FindBy(xpath ="//div[@class='flex-item right']//div//h3//a[@href='billing.php'][normalize-space()='Pay Billing']")
	WebElement payBilling_el;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickAddCustomer()
	{
		
		addCustomer_el.click();
	
	}
	
	public void clickPayBilling()
	{
		
		payBilling_el.click();
		
	
	}
	
	public void clickaddCustomertoTariff()
	{
		addcustomerToTariff_el.click();
	
	}
	
	public void clickAddTariffplan()
	{
		tariffPlan_el.click();
		
	}
	
	
	


	

}
