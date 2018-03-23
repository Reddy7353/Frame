package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class TestInvalidLogin extends BaseTest {

	@Test(priority=2)
	public void testInvlidLogin() throws Exception {		
		int rc = Excel.getRowCount(XL_PATH, "InvalidLogin");
		
		for(int i=1;i<=rc ;i++) {
		String un = Excel.getValue(XL_PATH, "InvalidLogin",i,0);
		String pw=Excel.getValue(XL_PATH, "InvalidLogin",i, 1);
		String errMsg=Excel.getValue(XL_PATH, "InvalidLogin", i, 2);
		LoginPage l=new LoginPage(driver);
		l.setUsername(un);
		l.setPassword(pw);
		l.clickLogin();
		Thread.sleep(1000);
		l.verifyErrorMsg(errMsg);
		Thread.sleep(2000);
	}
  }
}
