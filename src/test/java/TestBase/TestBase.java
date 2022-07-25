package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() 
	{
		
		
		try {
			prop = new Properties();
			FileInputStream
			ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	public void initialisation()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Saurabh\\chromenew\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		else if(browsername.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Saurabh\\geckodriver\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGELOAD_TIMEOUT));
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	

}
