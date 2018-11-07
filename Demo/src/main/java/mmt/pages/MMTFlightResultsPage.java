package mmt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilitypackage.BaseClass;

public class MMTFlightResultsPage extends BaseClass
{
	By book = By.xpath("(//a[text()='Book'])[1]");
	
	public WebElement book()
	{
		return driver.findElement(book);
	}
	
	public void clickOnBook()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(book));
		book().click();
		System.out.println("Clicked on Book Button");
	}
}
