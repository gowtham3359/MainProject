package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	/**
	 * Locating the WebElements
	 */
	@FindBy(xpath = "//a[text()='Leads' and @href='index.php?module=Leads&action=index']")
	private WebElement leadsMenu;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath ="//a[text()='Sign Out']")
	private WebElement signOutOption;
	
	/**
	 * Initializing the WebElements
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 
	/**
	 * Getters methods 
	 * @return
	 */
	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignOutOption() {
		return signOutOption;
	}
	
	/**
	 * This is business library which clicks on leads menu
	 */
	public void clickOnLeadsMenu() {
		getLeadsMenu().click();
	}
	
	/**
	 * This is business library which clicks on Contacts menu
	 */
	public void clickOnContactsMenu() {
		getContactsMenu().click();
	}
	
	/**
	 * This is business library to perform sign out operation
	 * @param driver
	 */
	public void signOutOperation(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(getAccountsIcon()).perform();
		getSignOutOption().click();
	}

}
