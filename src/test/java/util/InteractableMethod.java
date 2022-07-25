package util;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TestBase;

public class InteractableMethod extends TestBase{
	
	@FindBy(xpath="//label[@for='sele']")
	WebElement radioBtnbsdka;
	

	public InteractableMethod()
	{
		
		PageFactory.initElements(driver,this);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	
	public  void radio()
	{
		wait.until(ExpectedConditions.elementToBeClickable(radioBtnbsdka)).click();
		
	}

}
