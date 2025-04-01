package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass {
	@Test(groups={"Regression","Smoke"})
    public void Con_002() throws EncryptedDocumentException, IOException {
    	HomePage hp=new HomePage(driver);
	    hp.clickOnContactsMenu();
	    ContactsPage cp=new ContactsPage(driver);
	    cp.clickOnCreateNewContactIcon();
	    String lName=eUtil.getDataFromExcelFile("Contacts", 5, 1);
	    String email=eUtil.getDataFromExcelFile("Contacts", 5, 2);
	    String mobile=eUtil.getDataFromExcelFile("Contacts", 5, 3);
	    String mailingCity=eUtil.getDataFromExcelFile("Contacts", 5, 4);
	    CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
	    cncp.createNewContact(lName, email, mobile, mailingCity);
}
}