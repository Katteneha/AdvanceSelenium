package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLoginPage {
	
	//Step3: Create constructor or Initialization
	public VtigerLoginPage(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}
	
	
	// getter methods
	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPassWordTextField() {
		return PassWordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	

	//Step1: Element Declaration
	@FindBy(name = "user_name")
	private WebElement UserTextField;
	
	@FindBy(name = "user_password")
	private WebElement PassWordTextField;
	
	@FindBy(id = "submitButton")
	private WebElement LoginButton;
	
	/**
	 * this method is used for login to application
	 */
	
	public void loginToVtigerApp(String username, String password) {
		UserTextField.sendKeys(username);
		PassWordTextField.sendKeys(password);
		LoginButton.click();
	}
}
