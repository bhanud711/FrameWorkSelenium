package wdmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenricMethods {
	public static WebDriver driver;

	public void start()
	{
		try {
		switch("Chrome")
		{
		case "Chrome":
			System.setProperty("webdriver.chorme.driver", ".//drivers//chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "Firefox":	
			System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		case "IE":	
			System.setProperty("webdriver.ie.driver", ".//drivers//IE Driver ServerIEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		case "default":
			System.out.println("PLease give proper browsername");
			break;
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	public void launchUrl()
	{
		try {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public void screenMaximizer()
	{
		try {
			driver.manage().window().maximize();
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}	
	}
	
	public void urlAndTitle()
	{
		try {
			System.out.println("Title of the WebPage is:"+driver.getTitle());
			System.out.println("Url of the WebPage is:"+driver.getCurrentUrl());
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}	
	}
	public void typeText(WebElement ele,String data)
	{
		try {
		ele.clear();
		ele.sendKeys(data);	
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void clickElements(WebElement ele)
	{
		try {
		ele.click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}
	
	public void closeCurrentWindow()
	{
		try {
		driver.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void closeAllWindows()
	{
		try {
			driver.quit();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}
}
