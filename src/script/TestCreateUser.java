package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.ActiTIMEUserListPage;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class TestCreateUser extends BaseTest{

	
	@Test(priority=3)
	public void createuser() {
		String un = Excel.getValue(XL_PATH, "ValidLogin", 1, 0);
		String pw = Excel.getValue(XL_PATH, "ValidLogin", 1, 1);
		String title = Excel.getValue(XL_PATH, "ValidLogin", 1, 2);
		LoginPage l=new LoginPage(driver);
		l.setUsername(un);
		l.setPassword(pw);
		l.clickLogin();
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.clickUsers();
		int rc = Excel.getRowCount(XL_PATH, "CreateUser");
		System.out.println(rc);
		ActiTIMEUserListPage a=new ActiTIMEUserListPage(driver);
		
	for(int i=1;i<=rc;i++) {
		String fn = Excel.getValue(XL_PATH, "CreateUser", i, 0);
		String ln=Excel.getValue(XL_PATH, "CreateUser", i, 1);
		String email= Excel.getValue(XL_PATH, "CreateUser", i, 2);
		String pass= Excel.getValue(XL_PATH, "CreateUser", i, 3);
		String uname=Excel.getValue(XL_PATH, "CreateUser", i, 4);
		a.userCreation(fn, ln, email, pass, uname);
		a.clickcreateuser();
	}
	
 }
}
