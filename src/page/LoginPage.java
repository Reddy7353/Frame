package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.BaseTest;
import generic.Excel;

public class LoginPage {

	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(.,'Password')]")
	private WebElement errorMsg;

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un) {
		unTB.sendKeys(un);
	}
	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin() {
		loginBTN.click();
	}
	public void verifyErrorMsg(String expectedMsg) {
		String actualMsg=errorMsg.getText();
		Reporter.log(actualMsg,true);
		Assert.assertEquals(actualMsg, expectedMsg);
	}	
}
