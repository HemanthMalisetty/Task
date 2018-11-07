package Task.Demo;

import amazon.pages.AmazonAllMobilePhonesPage;
import amazon.pages.AmazonCheckOutPage;
import amazon.pages.AmazonHomePage;
import amazon.pages.AmazonOneplus6TPage;
import utilitypackage.BaseClass;
import utilitypackage.ExcelConfiguration;

public class AmazonAddToCartDemo {

	public static void main(String[] args) throws InterruptedException
	{
		ExcelConfiguration excel = new ExcelConfiguration(System.getProperty("user.dir")+"\\TestDataSheet.xlsx");
		String url = excel.getData(0, 1, 0);
		String title = excel.getData(0, 1, 0);
		BaseClass bs = new BaseClass();
		bs.OpenApplication("chrome", url);
		AmazonHomePage hp = new AmazonHomePage();
		hp.hovenOnCategory();
		hp.hoverOnMobiles();
		hp.clickOnAllMobilesLink();
		AmazonAllMobilePhonesPage allMobiles = new AmazonAllMobilePhonesPage();
		allMobiles.clickOnOneplus6t();
		AmazonOneplus6TPage oneplus = new AmazonOneplus6TPage();
		oneplus.clickOnAddToCart(title);
		AmazonCheckOutPage ckpage = new AmazonCheckOutPage();
		ckpage.AddedToCartValidation();
		Thread.sleep(5000);
		bs.CloseApplication();
	}
}
