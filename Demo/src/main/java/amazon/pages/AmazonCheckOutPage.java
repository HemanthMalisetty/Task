package amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitypackage.BaseClass;

public class AmazonCheckOutPage extends BaseClass
{
	By addedToCart = By.xpath("//h1[normalize-space()='Added to Cart']");

	public WebElement addedToCart()
	{
		return driver.findElement(addedToCart);
	}
	public void AddedToCartValidation()
	{
		if (addedToCart().isDisplayed()) 
		{
			System.out.println("Oneplus 6T addded to cart successfully");
		}
		else 
		{
			System.out.println("Oneplus 6T is not addded to cart successfully");
		}
	}
}
