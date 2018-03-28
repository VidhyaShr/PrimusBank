package AutomationSuite.PrimusBankSuite.library;

import org.openqa.selenium.By;


public class AdminHomePage extends AutomationSuite.PrimusBankSuite.constants.PrimusBankConstants
{

	public void adminLogout()
	{
		driver.findElement(By.xpath("//table/tbody/tr/td[3]/a/img")).click();
	}
	
	
}
