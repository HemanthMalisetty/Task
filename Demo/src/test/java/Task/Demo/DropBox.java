package Task.Demo;

import java.awt.AWTException;

import dropbox.pages.DropboxLoginPage;
import dropbox.pages.DropboxWelcomePage;
import utilitypackage.BaseClass;
import utilitypackage.ExcelConfiguration;

public class DropBox 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		ExcelConfiguration excel =new ExcelConfiguration(System.getProperty("user.dir")+"\\TestDataSheet.xlsx");
		String url = excel.getData(0, 3, 0);
		String brName = excel.getData(0, 3, 2);
		String email = excel.getData(0, 3, 3);
		String password = excel.getData(0, 3, 4);
		BaseClass bs= new BaseClass();
		bs.OpenApplication(brName, url);
		DropboxLoginPage login = new DropboxLoginPage();
		login.clickOnSignin();
		login.enterEmail(email);
		login.enterPassword(password);
		login.clickOnSigninButton();
		DropboxWelcomePage welcome =new DropboxWelcomePage();
		welcome.clickOnUpload();
		Thread.sleep(2000);
		welcome.clickOnFile();
		welcome.selectFile();
		welcome.clickOnUploadTo();
		welcome.clickOnUploadToDropbox();
		Thread.sleep(5000);
		bs.CloseApplication();
	}
}
