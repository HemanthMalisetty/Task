package Task.Demo;

import mmt.pages.MMTFlightResultsPage;
import mmt.pages.MMTHomePage;
import utilitypackage.BaseClass;
import utilitypackage.ExcelConfiguration;

public class MakeMyTrip 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ExcelConfiguration excel = new ExcelConfiguration(System.getProperty("user.dir")+"\\TestDataSheet.xlsx");
		String url = excel.getData(0, 2, 0);

		BaseClass MMTBase = new BaseClass();
		MMTBase.OpenApplication("chrome", url);
		MMTHomePage MMTHome = new MMTHomePage();
		
		MMTHome.clickOnfromTextBox();
		Thread.sleep(2000);
		MMTHome.clickOnfromCity();
		MMTHome.clickOnToTextBox();
		Thread.sleep(2000);
		MMTHome.clickOnToCity();
		MMTHome.clickOnDepartTextBox();
		MMTHome.clickOnDepatureDate();
		MMTHome.clickOnPassengerClassTextBox();
		MMTHome.clickOnTickets();
		MMTHome.clickOnFlightClass();
		MMTHome.clickOndoneLink();
		MMTHome.clickOnsearch();
		MMTFlightResultsPage flightResults = new MMTFlightResultsPage();
		flightResults.clickOnBook();
		Thread.sleep(5000);
		MMTBase.CloseApplication();

	}

}
