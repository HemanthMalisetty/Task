package utilitypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory 
{
	public static WebDriver getDriverFor(String brName) 
	{
		
		switch (brName.toLowerCase()) 
		{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
				return new ChromeDriver();
			case "ff":
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\heman\\Downloads\\Selenium Softwares\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			
				//open ff window
				return new FirefoxDriver();
			case "ie":
				System.setProperty("webdriver.ie.driver", "C:\\Users\\heman\\Downloads\\Selenium Softwares\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			
				//open ie window
				return new InternetExplorerDriver();
			case "edge":
				System.setProperty("webdriver.edge.driver", "C:\\Users\\heman\\Downloads\\Selenium Softwares\\Drivers\\Edge\\MicrosoftWebDriver.exe");
			
				//open edge window
				return new EdgeDriver();			
			default:
				System.out.println("Not a valid browser name");
				return null;
		}
	}
}
