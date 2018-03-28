package AutomationSuite.PrimusBankSuite.library;

import org.openqa.selenium.By;

public class BankerHomePage extends AutomationSuite.PrimusBankSuite.constants.PrimusBankConstants 
{

	public void bankerLogout()
	{
		driver.findElement(By.id("IMG1")).click();		
	}
	
	
}
