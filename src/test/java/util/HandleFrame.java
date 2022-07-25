package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestBase.TestBase;

public class HandleFrame extends TestBase {
	
	public static void Handleframe() {
		try {
			  WebElement frames = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
		  driver.switchTo().frame(frames);
		  driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
		  
	          }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		// window switch 
		  String windo =driver.getWindowHandle();
		  driver.switchTo().window(windo);
		
	}
}
