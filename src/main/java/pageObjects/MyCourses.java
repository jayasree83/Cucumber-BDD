package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyCourses {
	WebDriver driver;

	public MyCourses(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='My courses']")
	public WebElement MyCoursestxt;
	
	@FindBy(xpath = "//*[text()='Compose']")
	public WebElement lnkCompose;
	
	@FindBy(xpath = "//*[@id='compose_message']/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")
	public WebElement txtSendTo;
	
	@FindBy(id = "compose_message_title")
	public WebElement txtSubject;
	
	@FindBy(xpath = "//*[@id='cke_1_contents']/iframe")
	public WebElement txtMessage;
	
	@FindBy(xpath = "//*[@name='compose']")
	public WebElement btnSendMessage;
	
	@FindBy(xpath="//*[@class='alert alert-success']")
	public WebElement successMessage;
	
	public void validateLogin() {
		MyCoursestxt.isDisplayed();
	}
	
	public void clickOnComposeLink() throws InterruptedException {
		lnkCompose.click();
		Thread.sleep(3000);
	}
	public void enter_sendmailaddress(String SendTo) {
	Select drpdown=new Select(txtSendTo);
	txtSendTo.sendKeys(SendTo);
	drpdown.selectByVisibleText("Jayasree pentela (jayasree007)");
	
	}
	
	public void enter_subject(String Subject) {
	txtSubject.sendKeys(Subject);
	}
	
	public void enter_messagebody(String Message) {
		txtMessage.sendKeys(Message);
	}
	
	public void clickOnSendMessage() {
		btnSendMessage.click();
	}
	
	public void validate_MessageSent() {
		successMessage.isDisplayed();
	}
	
}
