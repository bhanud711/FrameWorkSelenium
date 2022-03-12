package wdmethods;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectMethods extends GenricMethods {
@BeforeSuite	
public void launch()
{
	start();
}

@BeforeTest
public void openApplication()
{
	launchUrl();	
}

@BeforeClass
public void screenAndUrlandTitle()
{
	screenMaximizer();
	urlAndTitle();
}

@AfterSuite
public void end()
{
	closeAllWindows();
}
}
