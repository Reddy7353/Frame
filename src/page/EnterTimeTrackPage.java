package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import generic.AutoUtil;
import generic.IAutoConst;


public class EnterTimeTrackPage implements IAutoConst{

     @FindBy(xpath="//div[.='USERS']/..")
     private WebElement userslink;
     
      public EnterTimeTrackPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 public void clickUsers()
	 {
		 userslink.sendKeys(Keys.ENTER);
	
	 }
	public void verifyHomePageIsDisplayed(WebDriver driver,String eTitle) {
		String strETO = AutoUtil.getPropertyValue(CONFIG_PATH,"ETO");
		 long ETO = Long.parseLong(strETO);
		 WebDriverWait wait=new WebDriverWait(driver, ETO);
		 try {
			 wait.until(ExpectedConditions.titleIs(eTitle));
			 Reporter.log("HomePage is displayed",true);
		 }
		catch(Exception e) {
			Reporter.log("HomePage is not displayed",true);
			Assert.fail();
		}
	}
	
	
	
	
}