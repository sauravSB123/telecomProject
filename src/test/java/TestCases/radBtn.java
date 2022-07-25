package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radBtn {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Saurabh\\chromenew\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']")).click();
	
		
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//input[@value='0']")).click();

	
	}

}
