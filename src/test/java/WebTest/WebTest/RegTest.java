package WebTest.WebTest;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testData.ExcelDataReader;

public class RegTest extends TestBase {
	

		
		@DataProvider (name ="data")
			public Object [][] getTestData() throws IOException{
			
			ExcelDataReader  obj = new ExcelDataReader();
			return obj.GetExcelData();
		}
			
		
	
@BeforeTest
	
	public void opennBrowser() {
		
		openChrome("https://www.performancetestingpractice.com/register.php");
		
}

@Test(dataProvider = "data")
public void RegMethod (String Firstn, String Lastn, String email, String cemail,
			String username,String pass , String dob , String phones , String address ,
			String city , String zip)   {
	
     RegisterPage SinUp = new RegisterPage(driver);
     try {
		SinUp.Register(Firstn, Lastn, email, cemail, username, pass, dob, phones, address, city, zip);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}	


}

/*public void RegMethod () throws InterruptedException {
	
	RegisterPage RRejObj = new RegisterPage(driver);

	RRejObj.Register("Vikings", "Vikings", "Vikings@mailinator.com", "Vikings@mailinator.com", "Vikings",  "Password0101", "01/01/1999", "01220472003", "Jacson steet", "Cairo", "14285");
	
}*/

//("Vikings", "Vikings", "Vikings@mailinator.com", "Vikings@mailinator.com", "Vikings", "Password0101", "01220472003", "Jacson steet", "Cairo", "14285");
	

