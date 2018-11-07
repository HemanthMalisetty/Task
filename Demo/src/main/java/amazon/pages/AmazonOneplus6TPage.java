package amazon.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitypackage.BaseClass;

public class AmazonOneplus6TPage extends BaseClass
{
	By addToCart = By.xpath("//input[@name='submit.add-to-cart']");
	
	public WebElement addToCart(String title)
	{
		Set<String> lstWindows = driver.getWindowHandles();
		for(String wnd:lstWindows) {
			driver.switchTo().window(wnd);
			if(driver.getTitle().equals(title)) {
				System.out.println(driver.getTitle());
				break;
			}
		}
		return driver.findElement(addToCart);
	}
	
	public void clickOnAddToCart(String title)
	{
		addToCart(title).click();
		System.out.println("Clicked on Add Cart");
	}
}
