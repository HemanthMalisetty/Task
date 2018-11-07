package amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilitypackage.BaseClass;

public class AmazonHomePage extends BaseClass
{
	
	
	By category = By.xpath("//span[text()='Category']");
	By mobiles = By.xpath("//span[text()='Mobiles, Computers']");
	By allMobilePhones = By.xpath("//span[text()='All Mobile Phones']");
	
	
	public WebElement categoryLink()
	{
		return driver.findElement(category);
	}
	public WebElement mobilesLink()
	{
		return driver.findElement(mobiles);
	}
	public WebElement allMobilesLink()
	{
		return driver.findElement(allMobilePhones);
	}
	
	public void hovenOnCategory()
	{
		Actions act = new Actions(driver);
		act.moveToElement(categoryLink()).build().perform();
		System.out.println("Hover on Category");
	}
	public void hoverOnMobiles()
	{
		Actions act = new Actions(driver);
		act.moveToElement(mobilesLink()).build().perform();
		System.out.println("Hover on Mobiles");
	}
	public void clickOnAllMobilesLink()
	{
		allMobilesLink().click();
		System.out.println("clicked on All Mobiles Link");
	}
}
