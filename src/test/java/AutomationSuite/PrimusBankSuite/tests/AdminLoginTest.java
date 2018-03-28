package AutomationSuite.PrimusBankSuite.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import AutomationSuite.PrimusBankSuite.constants.PrimusBankConstants;
import AutomationSuite.PrimusBankSuite.library.AdminHomePage;
import AutomationSuite.PrimusBankSuite.library.PrimusBankHomePage;



public class AdminLoginTest extends PrimusBankConstants
{

	@Test
	public void adminLoginTest()
	{
		boolean res;
		PrimusBankHomePage phome=new PrimusBankHomePage();
		res=phome.adminLogin("Admin", "Admin");
		Assert.assertTrue(res);		
		AdminHomePage ahome=new AdminHomePage();
		ahome.adminLogout();
	}
	
	
	
	
}
