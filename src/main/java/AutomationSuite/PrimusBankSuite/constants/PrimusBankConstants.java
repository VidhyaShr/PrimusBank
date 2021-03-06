package AutomationSuite.PrimusBankSuite.constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PrimusBankConstants 
{

	public static WebDriver driver;
	public static String url="http://primusbank.qedgetech.com";
	
	@BeforeTest
	public static void launchApp()
	{
		driver=new FirefoxDriver();
		driver.get(url);
	}
	
	@AfterTest
	public static void closeApp()
	{
		driver.close();
	}
	
	
}
