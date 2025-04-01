package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	
	/**
	 * Locating the WebElements
	 */
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createNewLeadIcon;
	
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Initializing Webelements
	 * @return
	 */
	public WebElement getCreateNewLeadIcon() {
		return createNewLeadIcon;
	}
	
	/**
	 * This is business library to click on create new lead icon
	 */
	public void clickOnCreateNewLeadIcon() {
		getCreateNewLeadIcon().click();
		
	}

}
