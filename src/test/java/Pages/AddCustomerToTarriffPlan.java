package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class AddCustomerToTarriffPlan extends TestBase {
	
	@FindBy(xpath="//a[@class='logo']")
	WebElement logo;
	
	
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement submitBtn;

	@FindBy(xpath="//*[@id=\'customer_id\']")
	WebElement custidInput;
	
	
	public AddCustomerToTarriffPlan()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyLogo()
	{
		return logo.isDisplayed();
		
	}
	
	
	public void clicToEnterCustId()
	{
		
		custidInput.sendKeys(prop.getProperty("CustomerId"));
		submitBtn.click();
	}
	

}
