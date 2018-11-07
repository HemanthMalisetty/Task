package mmt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitypackage.BaseClass;
public class MMTHomePage extends BaseClass
{
	By fromTextBox = By.xpath("//input[@id='hp-widget__sfrom']");
	By fromCity = By.xpath("//ul[@id='ui-id-1']//span[normalize-space()='Bangalore, India']//ancestor::li");
	By toTextBox = By.xpath("//input[@id='hp-widget__sTo']");
	By toCity = By.xpath("//ul[@id='ui-id-2']//span[normalize-space()='Hyderabad, India']//ancestor::li");
	By departTextBox = By.xpath("//input[@id='hp-widget__depart']");
	By depatureDate = By.xpath("//div[@class='dateFilter hasDatepicker']//span[normalize-space()='December']//ancestor::div[@class='ui-datepicker-group ui-datepicker-group-last']//a[text()='4']");
	By passengerClassTextBox = By.xpath("//input[@id='hp-widget__paxCounter_pot']");
	By tickets = By.xpath("//p[contains(text(),'ADULTS')]//ancestor::div[@class='paxCounter']//li[text()='2']");
	By flightClass = By.xpath("//span[text()='Premium Economy']");
	By doneLink = By.xpath("(//a[text()='Done'])[2]"); 
	By search = By.xpath("//button[@id='searchBtn']");
	
	
	public WebElement fromTextBox()
	{
		return driver.findElement(fromTextBox);
	}
	public WebElement fromCity()
	{
		
		return driver.findElement(fromCity);
	}
	public WebElement toTextBox()
	{
		return driver.findElement(toTextBox);
	}
	public WebElement toCity()
	{
		return driver.findElement(toCity);
	}
	public WebElement departTextBox()
	{
		return driver.findElement(departTextBox);
	}
	public WebElement depatureDate()
	{
		return driver.findElement(depatureDate);
	}
	public WebElement passengerClassTextBox()
	{
		return driver.findElement(passengerClassTextBox);
	}
	public WebElement tickets()
	{
		return driver.findElement(tickets);
	}
	public WebElement flightClass()
	{
		return driver.findElement(flightClass);
	}
	public WebElement doneLink()
	{
		return driver.findElement(doneLink);
	}
	public WebElement search()
	{
		return driver.findElement(search);
	}
	
	
	public void clickOnfromTextBox()
	{
		fromTextBox().click();
		System.out.println("Clicked on From Textbox");
	}
	public void clickOnfromCity()
	{
		fromCity().click();
		System.out.println("Seleced From City");
	}
	public void clickOnToTextBox()
	{
		toTextBox().click();
		System.out.println("clicked on To Text Box");
	}
	
	public void clickOnToCity()
	{
		toCity().click();
		System.out.println("Selected To City");
	}
	public void clickOnDepartTextBox()
	{
		departTextBox().click();
		System.out.println("clicked on Depart Textbox");
	}
	public void clickOnDepatureDate()
	{
		depatureDate().click();
		System.out.println("clicked on DepatureDate");
	}
	public void clickOnPassengerClassTextBox()
	{
		passengerClassTextBox().click();
		System.out.println("clicked on Passenger Class Textbox");
	}
	public void clickOnTickets()
	{
		tickets().click();
		System.out.println("Tickets Selected");
	}
	public void clickOnFlightClass()
	{
		flightClass().click();
		System.out.println("Selected Flight Class");
	}
	public void clickOndoneLink()
	{
		doneLink().click();
		System.out.println("clicked on Done Button");
	}
	public void clickOnsearch()
	{
		search().click();
		System.out.println("clicked on Search Button");
	}
}
