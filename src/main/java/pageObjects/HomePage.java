package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"login-block\"]/div/ul/li[1]/a")
	public WebElement lnk_Signup;

	
	@FindBy(id = "login")
	public WebElement txtlogin;
	
	@FindBy(id="password")
	public WebElement txtpass;
	
	@FindBy(xpath = "//*[text()='Login']")
	public WebElement btnLogin;
	
	@FindBy(xpath = "//*[text()= 'Compose']")
	public WebElement lnk_Compose;
	
	public void validateTitle() {
		String title= driver.getTitle();
		System.out.println("Title of the page is: " +title);
	}
	public void clickOnSignup() {
		lnk_Signup.click();
	}
	
	public void click_compose() {
		lnk_Compose.click();
	}
	
	public void enter_loginusername(String username) {
		txtlogin.sendKeys(username);
	}
	
	public void enter_loginpassword(String password) {
		txtpass.sendKeys(password);
	}
	
	public void clickOnLogin() throws InterruptedException {
		btnLogin.click();
		Thread.sleep(3000);
	}
	
}
