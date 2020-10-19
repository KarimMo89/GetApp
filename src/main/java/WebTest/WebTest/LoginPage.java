package WebTest.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub	
	}
	
	
	@FindBy(id="uid")
	WebElement username;
	
	@FindBy(id="passw")
	WebElement Password;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement loginbut;
	
	
	public void loginmethod (String Usname , String Pass ) {
		
		username.sendKeys(Usname);
		Password.sendKeys(Pass);
		loginbut.click();
		
	}
}
