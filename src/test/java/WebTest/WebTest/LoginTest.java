package WebTest.WebTest;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testData.ExcelDataReader;

public class LoginTest extends TestBase {
	
	@DataProvider (name ="Date")
		public Object [][] getTestData() throws IOException{
		
		ExcelDataReader  obj = new ExcelDataReader();
		return obj.GetExcelData();
	}
		
	
	
	@BeforeTest
	
	public void opennBrowser() {
		
		openChrome("http://testfire.net/login.jsp");
		
	}
	
	
	@Test
	
	public void loginMethod () {
		
		LoginPage LoginObj = new LoginPage (driver);
		LoginObj.loginmethod("admin", "admin");
		
	}

}
