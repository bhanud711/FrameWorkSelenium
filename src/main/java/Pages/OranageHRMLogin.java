package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdmethods.ProjectMethods;

public class OranageHRMLogin extends ProjectMethods{
	public OranageHRMLogin()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(how=How.XPATH,using="//input[@id='txtUsername']")
public WebElement username;


public OranageHRMLogin enterUsername(String data)
{
	typeText(username,data);
	return this;
}

@FindBy(how=How.XPATH,using="//input[@id='txtPassword']")
public WebElement password;


public OranageHRMLogin enterPassword(String data)
{
	typeText(password,data);
	return this;
}

@FindBy(how=How.XPATH,using="//input[@name='Submit']")
public WebElement button;


public OrangeHRMHomePage clickButton()
{
	clickElements(button);
	return new OrangeHRMHomePage();
}
}