package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass {
	
	@Test(groups={"Regression","Smoke"})
	public void Con_001() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		String lName=eUtil.getDataFromExcelFile("Contacts", 2, 1);
		String title=eUtil.getDataFromExcelFile("Contacts", 2, 2);
		String dept=eUtil.getDataFromExcelFile("Contacts", 2, 3);
		CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
		cncp.createNewContact(lName, title, dept);
		
	}

}
