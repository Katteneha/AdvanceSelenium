package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Java_Utility;

public class CreateOrganizationPage {
	public CreateOrganizationPage (WebDriver dr) {
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(css = "[alt='Create Organization...']")
	private WebElement plusImg;
	
	@FindBy(name="accountname")
	private WebElement orgName;
	
	@FindBy(id="phone")
	private WebElement phoneNum;
	
	@FindBy(id="email1")
	private WebElement emailId;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
    private WebElement saveButton;
	
	//getter methods

	public WebElement getPlusImg() {
		return plusImg;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getPhoneNum() {
		return phoneNum;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void clickPlusImg() {
		plusImg.click();
	}

	public void createOrgData(String orgData,String phoneNumb, String emailID) {
		
		orgName.sendKeys(orgData);
		phoneNum.sendKeys(phoneNumb);
		emailId.sendKeys(emailID);
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
}
