package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass{
	
	@Test(groups={"Regression","Sanity"})
	public void LE_003() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnCreateNewLeadIcon();
		String lName=eUtil.getDataFromExcelFile("Leads", 8, 1);
		String company=eUtil.getDataFromExcelFile("Leads", 8, 2);
		String leadSource=eUtil.getDataFromExcelFile("Leads", 8, 3);
		String noOfEmployees=eUtil.getDataFromExcelFile("Leads", 8, 4);
		String city=eUtil.getDataFromExcelFile("Leads", 8, 5);
		String country=eUtil.getDataFromExcelFile("Leads", 8, 6);
		String state=eUtil.getDataFromExcelFile("Leads", 8, 7);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.CreateNewLead(lName, company, leadSource, noOfEmployees, city, country, state);
	}

}
