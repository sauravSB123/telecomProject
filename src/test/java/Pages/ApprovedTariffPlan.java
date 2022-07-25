package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;
import util.InteractableMethod;

public class ApprovedTariffPlan extends TestBase {
	
	InteractableMethod in = new InteractableMethod();
	
	
	
	@FindBy(xpath ="//input[@id='sele']")
	WebElement radioBtn;
	
	@FindBy(xpath ="//input[@name='submit']")
	WebElement submiBtn;
	
	@FindBy(xpath ="/html/body/section/div/ul/li/a")
	WebElement homeBtn;
	
	public ApprovedTariffPlan()
	{
		PageFactory.initElements(driver , this );
	}
	
	
	public void clickApprovedTariffPlan() throws InterruptedException
	{
		
		System.out.println(radioBtn.isSelected());
		//Thread.sleep(4000);
	   // driver.findElement(By.xpath("//input[@id='sele']\"")).click();
	     
		submiBtn.click();
		homeBtn.click();
	}

}
