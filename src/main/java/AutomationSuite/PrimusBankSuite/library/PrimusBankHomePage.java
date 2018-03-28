package AutomationSuite.PrimusBankSuite.library;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PrimusBankHomePage extends AutomationSuite.PrimusBankSuite.constants.PrimusBankConstants 
{

	public boolean adminLogin(String uid,String pwd)
	{
		String expurl,acturl;
		expurl="adminflow";
		
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		acturl=driver.getCurrentUrl();
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
	
	
	public boolean bankerLogin(String branchname,String uid,String pwd)
	{
		String expurl,acturl;
		expurl="Bankers_flow";
		
		Select blist=new Select(driver.findElement(By.id("drlist")));
		blist.selectByVisibleText(branchname);
		
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		acturl=driver.getCurrentUrl();
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		{
			return true;
		} else 
		{
			return false;
		}
		
	}
	
	
}
