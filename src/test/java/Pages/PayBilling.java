package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class PayBilling extends TestBase {
	
	@FindBy (id="customer_id")
	WebElement enteruserId;
	//input[@name='submit']
	@FindBy (xpath="//input[@name='submit']")
	WebElement  clicksubmitbtn;
	
	public PayBilling(){
		PageFactory.initElements(driver, this);
	}
	public void enteruserId() {
		enteruserId.sendKeys(prop.getProperty("CustomerId"));
	}
	public void clickbillingsubmitbtn() {
		clicksubmitbtn.click();
	}
}
