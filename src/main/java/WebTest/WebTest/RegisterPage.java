package WebTest.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase {

public 	RegisterPage (WebDriver driver) {
	super(driver);

}
	
@FindBy(xpath="//input[@class='form-control']")
WebElement Firstname;


@FindBy(xpath="(//input[@class='form-control'])[2]")
WebElement Lastname;

@FindBy(xpath="(//input[@class='form-control'])[3]")
WebElement Email;

@FindBy(xpath="//input[@placeholder='Confirm E-Mail Address']")
WebElement CEmail;

@FindBy(xpath="//input[@placeholder='User Name']")
WebElement Uasername;

@FindBy(xpath="//input[@placeholder='Password']")
WebElement Password;

@FindBy(xpath="//input[@class='form-control hasDatepicker']")
WebElement DOB;

@FindBy(xpath="//input[@placeholder='(845)555-1212']")
WebElement Phone;

@FindBy(xpath="//input[@placeholder='Address']")
WebElement Adress;

@FindBy(xpath="//input[@placeholder='city']")
WebElement City;

@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/select/option[1]")
WebElement State1;
//select[@class='form-control selectpicker']
@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/select/option[2]")
WebElement State12;
//*[@id="contact_form"]/fieldset/div[11]/div/div/select/option[2]

@FindBy(xpath="//input[@placeholder='Zip Code']")
WebElement Zip;

@FindBy(xpath="//button[@class='btn btn-default']")
WebElement RegBut;


public void Register(String Firstn, String Lastn , String email,String cemail, String username, String pass ,String dob, String phones , String address , String city , String zip ) throws InterruptedException {
	
	Firstname.sendKeys(Firstn);
	
	Lastname.sendKeys(Lastn);
	
	Email.sendKeys(email);
	
	CEmail.sendKeys(cemail);
	
	Uasername.sendKeys(username);

	Password.sendKeys(pass);

	DOB.sendKeys(dob);
	//DOB.sendKeys("02/02/1999");
	Phone.sendKeys(phones);
	
	Adress.sendKeys(address);
	
	City.sendKeys(city);

	State1.click();
	
	Thread.sleep(3000);
	State12.click();
	
	
	Zip.sendKeys(zip);

	RegBut.click();
	
}
}
