package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.driverInstance;
import pages.LoginPage;

public class TC001_ValidateLoginFunctionality extends driverInstance {
	
	@Test
	public void tc001_LinkedInReg() throws IOException {
		LoginPage login= new LoginPage(driver);
		login.enterUsername("uname");
		login.enterPassword("pass");
		login.clickSubmitButton();
	}

}
