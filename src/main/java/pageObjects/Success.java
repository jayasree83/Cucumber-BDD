package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Success {
	WebDriver driver;

	public Success(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='An e-mail has been sent to remind you of your login and password.']")
	WebElement confirmationtext;
	
	@FindBy(xpath = "//*[@title= 'Homepage']")
	WebElement lnk_homepage;
	
	public void validate_registrationSuccess() {
		confirmationtext.isDisplayed();
	}
	
	public void click_Homepagelink() {
		lnk_homepage.click();
	}
}
