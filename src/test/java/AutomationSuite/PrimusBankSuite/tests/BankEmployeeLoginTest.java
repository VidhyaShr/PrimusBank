package AutomationSuite.PrimusBankSuite.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import AutomationSuite.PrimusBankSuite.constants.PrimusBankConstants;
import AutomationSuite.PrimusBankSuite.library.BankerHomePage;
import AutomationSuite.PrimusBankSuite.library.PrimusBankHomePage;


public class BankEmployeeLoginTest extends PrimusBankConstants
{

	@Test
	public void bankerLoginTest()
	{
		boolean res;
		PrimusBankHomePage phome=new PrimusBankHomePage();
		res=phome.bankerLogin("Ameerpet", "Richards", "demo");
		Assert.assertTrue(res);
		BankerHomePage bhome=new BankerHomePage();
		bhome.bankerLogout();		
	}
	
	
}
