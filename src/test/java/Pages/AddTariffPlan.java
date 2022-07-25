package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class AddTariffPlan extends TestBase {
	
	@FindBy(xpath="//input[@id='rental1']")
	WebElement monthlyRental_ele;
	
	@FindBy(xpath="//input[@id='local_minutes']")
	WebElement freelocalMinuites_ele;
	
	@FindBy(xpath="//input[@id='inter_minutes']")
	WebElement interMinuites_ele;
	
	@FindBy(xpath="//input[@id='sms_pack']")
	WebElement freeSmsPack_ele;
	
	@FindBy(xpath="//input[@id='minutes_charges']")
	WebElement localMinutesCharge_ele;
	
	@FindBy(xpath="//input[@id='inter_minutes']")
	WebElement freeinterNatMinutesCharge_ele;
	
	@FindBy(xpath="//input[@id='inter_charges']")
	WebElement freeinterNatMinutesCharge;
	
	

	@FindBy(xpath="//input[@id='sms_charges']")
	WebElement sms_ele;
	

	@FindBy(xpath="//input[@name='submit']")
	WebElement subMit_Btn;
	
	
	
	public AddTariffPlan()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterTariffDetails()
	{
		monthlyRental_ele.sendKeys(prop.getProperty("MonthlyRental"));
		freelocalMinuites_ele.sendKeys(prop.getProperty("FreeLocalMinutes"));
		interMinuites_ele.sendKeys(prop.getProperty("FreeInternationalMinutes"));
		freeSmsPack_ele.sendKeys(prop.getProperty("FreeSMSPack"));
		localMinutesCharge_ele.sendKeys(prop.getProperty("LocalPerMinutesCharges"));
		freeinterNatMinutesCharge.sendKeys(prop.getProperty("InternationalPerMinute"));
		sms_ele.sendKeys(prop.getProperty("SMSPerCharges"));
		subMit_Btn.click();
		
		
	}
	
	

}
