package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@name='firstname']")
	public WebElement txtFirstname;
	
	@FindBy(xpath = "//*[@name='lastname']")
	public WebElement txtLastname;
	
	@FindBy(xpath = "//*[@name='email']")
	public WebElement txtEmail;
	
	@FindBy(xpath = "//*[@name='username']")
	public WebElement txtusername;
	
	@FindBy(xpath = "//*[@name='pass1']")
	public WebElement txtpwd;
	
	@FindBy(xpath = "//*[@name='pass2']")
	public WebElement txtConfirmpwd;
	
	@FindBy(xpath = "//*[@name='submit']")
	public WebElement btnRegister;
	
	public void enter_Firstname(String firstname) {
		txtFirstname.sendKeys(firstname);
	}
	
	public void enter_lastname(String lastname) {
		txtLastname.sendKeys(lastname);
	}
	
	public void enter_email(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void enter_username(String user) {
		txtusername.sendKeys(user);
	}
	
	public void enter_password(String pwd) {
		txtpwd.sendKeys(pwd);
	}
	
	public void enter_confirmpassword(String confirmpwd) {
		txtConfirmpwd.sendKeys(confirmpwd);
	}
	
	public void click_register() {
		btnRegister.click();
	}
	
}
