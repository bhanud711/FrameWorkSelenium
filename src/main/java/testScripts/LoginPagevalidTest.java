package testScripts;

import org.testng.annotations.Test;

import Pages.OranageHRMLogin;
import wdmethods.ProjectMethods;

public class LoginPagevalidTest extends ProjectMethods {

	@Test
	public void validScenario()
	{
	new OranageHRMLogin()
	.enterUsername("Admin")
	.enterPassword("admin123")
	.clickButton();
	}
}
