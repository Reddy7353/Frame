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
		
		ActiTIMEUserListPage a=new ActiTIMEUserListPage(driver);
		
		a.userCreation("Rajavardhan", "Reddy","rajavardhanreddy22@gmail.com", "reddy444", "Reddy7353");
		a.clickcreateuser();;
	}
	
}
