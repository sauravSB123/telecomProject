package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TestBase;

public class AddCustomer extends TestBase {
	
	@FindBy(xpath ="//input[@id='fname']")
    WebElement firstName_el;
	
	@FindBy(xpath ="//input[@id ='done']")
    WebElement doneRadioBtn_el;
	
	
	@FindBy(xpath ="//input[@id='lname']")
    WebElement lastName_el;
	
	
	@FindBy(xpath ="//input[@id='email']")
    WebElement email_el;
	

	@FindBy(xpath ="//textarea[@id='message']")
    WebElement adress_el;
	

	@FindBy(xpath ="//input[@id='telephoneno']")
    WebElement mobNo_el;
	
	@FindBy(xpath ="//input[@name='submit']")
    WebElement submitBtn_el;
	
	
	
	@FindBy(xpath ="//a[@class='logo']")
    WebElement guruLogo_el;
   public AddCustomer()
   {
	   
	   PageFactory.initElements(driver, this);
   }
   
   
   public void registerDetails()
   {
	   //doneRadioBtn_el.click();
	   firstName_el.sendKeys("ramesh");
	   lastName_el.sendKeys("sippy");
	   email_el.sendKeys("rameshBidu@gmail.com");
	   adress_el.sendKeys("gadge nagar amt");
	   mobNo_el.sendKeys("9191919191");
	   submitBtn_el.click();
	   
	   
	   
   }
   
   public boolean guruLogo()
   {
	   boolean logo = guruLogo_el.isDisplayed();
	   return logo;
   }
   
}
