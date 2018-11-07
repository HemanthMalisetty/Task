package dropbox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitypackage.BaseClass;

public class DropboxLoginPage extends BaseClass
{
	
	public DropboxLoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@id='sign-up-in']") WebElement signin;
	@FindBy(xpath = "//input[@class='text-input-input']") WebElement email;
	@FindBy(xpath = "//input[@name='login_password']") WebElement password;
	@FindBy(xpath = "//button[@class='login-button signin-button button-primary']") WebElement signinbutton;
	
		
	public void clickOnSignin()
	{
		signin.click();
		System.out.println("Clicked on Signin Page");
	}
	public void enterEmail(String mail)
	{
		email.sendKeys(mail);
		System.out.println("Email Entered Successfully");
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
		System.out.println("Password Entered successfully");
	}
	public void clickOnSigninButton()
	{
		signinbutton.click();
		System.out.println("Clicked on Signin Button Successfully");
	}
}
