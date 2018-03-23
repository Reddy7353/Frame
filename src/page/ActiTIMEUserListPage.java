package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIMEUserListPage {

	@FindBy(xpath="(//div[.='Add User'])[1]")
	private WebElement addUsersBtn;
	
	@FindBy(name="firstName")
	private WebElement fName;
	
	@FindBy(name="lastName")
	private WebElement lName;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="username")
	private WebElement uncr;
	
	@FindBy(name="password")
	private WebElement pwcr;
	
	@FindBy(name="passwordCopy")
	private WebElement repw;
	
	@FindBy(xpath="//span[.='Create User']")
	private WebElement clickcreateuser;
	
	public ActiTIMEUserListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void userCreation(String FN,String LN,String Email,String Pass,String Username) {
		
		addUsersBtn.click();
		fName.sendKeys(FN);
		lName.sendKeys(LN);
		email.sendKeys(Email);
		uncr.sendKeys(Username);
		pwcr.sendKeys(Pass);
		repw.sendKeys(Pass);
	}
	
	public void clickcreateuser()
	{
		clickcreateuser.click();;
	}
	
}
