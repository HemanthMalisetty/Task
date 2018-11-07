package utilitypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilitypackage.DriverFactory;

public class BaseClass extends DriverFactory 
{
	public static WebDriver driver;
	WebDriverWait wait;
	public void OpenApplication(String brName, String url)
	{
		driver = DriverFactory.getDriverFor(brName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("Application LOnched successfully");
	}
	public void CloseApplication()
	{
		driver.quit();
		System.out.println("Application Closed Successfully");
	}
}
