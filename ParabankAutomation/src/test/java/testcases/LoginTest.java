package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import org.testng.Assert;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void validLogin() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginUser("sikder", "admin123");
		
//		Validation
		String exp_title = "ParaBank | Accounts Overview";
		String act_title = driver.getTitle();
		Assert.assertEquals(act_title, exp_title, "Login Failed!");
	
	}
	

}
