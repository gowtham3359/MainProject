package seleniumsection3;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_Practice extends BaseClass{
	
	@Test
	public void testCase() throws Exception
	{
		ExcelUtility eUtil = new ExcelUtility();
		
		String fName = eUtil.getDataFromExcelFile("Leads", 2, 1);
		String lName = eUtil.getDataFromExcelFile("Leads", 2, 2);
		String company = eUtil.getDataFromExcelFile("Leads", 2, 3);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.CreateNewLead(fName, lName, company);
		
	}

}
