package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utilities.WebDriver_Utility;

public class homePage {
	public homePage(WebDriver dr) {
		PageFactory.initElements(dr, this);
		
	}

	@FindBy(linkText = "Products")
	private WebElement ProductLink;
	
	@FindBy(linkText = "Sign Out")
	private WebElement SignOut;

	@FindBy(linkText = "More")
	private WebElement moreLink;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignLink;
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	
	public WebElement getContactsLink() {
		return contactsLink;
	}

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement admLink;
	
	//getter methods
	public WebElement getProductLink() {
		return ProductLink;
	}

	public WebElement getSignOut() {
		return SignOut;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getCampaignLink() {
		return campaignLink;
	}

	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getAdmLink() {
		return admLink;
	}
	

	//business logic
	public void clickProductLink() {
		ProductLink.click();
	}
	
	public void clickMoreLink() {
		moreLink.click();
	}
	
	public void clickCampaignsLink() {
		campaignLink.click();
	}
	
	public void clickOrganizationLink()
	{
		organizationLink.click();
	}
	
	public void clickContactsLink()
	{
		contactsLink.click();
	}
	
	
	public void clickAdmImg()
	{
		admLink.click();
	}
	
	public void clickOnSignOut()
	{
		SignOut.click();
	}
	
	public void logOut(WebDriver dr)
    {
    	WebDriver_Utility wlib = new WebDriver_Utility();
    	wlib.moveToElement(dr, admLink);
    	SignOut.click();
    }

		
}
