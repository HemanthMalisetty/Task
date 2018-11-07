package amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilitypackage.BaseClass;

public class AmazonAllMobilePhonesPage extends BaseClass
{
	By oneplus6t = By.xpath("//a[text()='OnePlus 6T (Mirror Black, 6GB RAM, 128GB Storage)']");
	
	public WebElement oneplus6t()
	{
		return driver.findElement(oneplus6t);
	}
	
	public void clickOnOneplus6t() throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(oneplus6t()).build().perform();
		Thread.sleep(3000);
		oneplus6t().click();
		System.out.println("Clicked on Oneplus 6T");
	}
}
