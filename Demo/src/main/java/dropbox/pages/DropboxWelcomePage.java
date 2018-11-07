package dropbox.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitypackage.BaseClass;

public class DropboxWelcomePage extends BaseClass 
{
	public DropboxWelcomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='primary-action-menu__button-wrapper']//button[@class='mc-popover-trigger']") WebElement upload;
	@FindBy(xpath = "//button[@class='action-upload-files mc-popover-content-item']") WebElement file;
	@FindBy(xpath = "//span[@class='tree-view__item-label']") WebElement uploadTo;
	@FindBy(xpath = "//span[@class='mc-button-content' and text() = 'Upload']") WebElement uploadToDropbox;
	
	
	public void clickOnUpload()
	{
		upload.click();
		System.out.println("Clicked on Upload Button");
	}
	public void clickOnFile()
	{
		file.click();
		System.out.println("Clicked on file button");
	}
	public void clickOnUploadTo()
	{
		uploadTo.click();
		System.out.println("Selected foder to upload file");
	}
	public void clickOnUploadToDropbox()
	{
		uploadToDropbox.click();
		System.out.println("Clicked on upload to Dropbox");
	}
	
	public void selectFile() throws AWTException, InterruptedException
	{
		String flPath = "C:\\Users\\heman\\Desktop\\Amazon_Testcase.xlsx";
		
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(new StringSelection(flPath), null);
		
		Robot robo = new Robot();
		
		Thread.sleep(1000);
		
		//press ctrl v
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(1000);
		
		//press enter
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		System.out.println("Selected the upload file");
	}
}
