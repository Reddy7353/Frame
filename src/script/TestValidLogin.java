package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class TestValidLogin extends BaseTest {

	
	@Test(priority=1)
	public void testValidlogin() {
		
		String un = Excel.getValue(XL_PATH, "ValidLogin", 1, 0);
		String pw = Excel.getValue(XL_PATH, "ValidLogin", 1, 1);
		String title = Excel.getValue(XL_PATH, "ValidLogin", 1, 2);
		LoginPage l=new LoginPage(driver);
		l.setUsername(un);
		l.setPassword(pw);
		l.clickLogin();
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyHomePageIsDisplayed(driver, title);
		
	}
}
