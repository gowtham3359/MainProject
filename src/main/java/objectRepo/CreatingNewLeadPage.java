package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewLeadPage {
	
	/**
	 * Locating WebElements
	 */
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextField;

	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyTextField;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement titleTextField;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadSourceDropdown;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployeesTextField;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement cityTextField;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement countryTextField;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement stateTextField;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	/**
	 * Initializing WebElements
	 * @param driver
	 */
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Getter methods
	 * @return
	 */
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getLeadSourceDropDown() {
		return leadSourceDropdown;
	}

	public WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	/**
	 * This is a business library to create a new lead
	 * @param fName
	 * @param lName
	 * @param company
	 */
	public void CreateNewLead(String fName, String lName, String company) {
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param fName
	 * @param lName
	 * @param company
	 * @param title
	 * @param mobile
	 * @param email
	 */
	public void CreateNewLead(String fName, String lName, String company, String title, String mobile,String email) {
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getTitleTextField().sendKeys(title);
		getMobileTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getSaveButton().click();
		
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param lName
	 * @param company
	 * @param leadsource
	 * @param noofemployees
	 * @param city
	 * @param country
	 * @param state
	 */
	public void CreateNewLead(String lName,String company,String leadsource, String noofemployees,String city, String country, String state) {
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		Select sel = new Select(getLeadSourceDropDown());
		sel.selectByValue(leadsource);
		getNoOfEmployeesTextField().sendKeys(noofemployees);
		getCityTextField().sendKeys(city);
		getCountryTextField().sendKeys(country);
		getStateTextField().sendKeys(state);
		getSaveButton().click();
		
	}

}
