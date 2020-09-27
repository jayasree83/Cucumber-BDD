package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.ComposeMail;
import pageObjects.HomePage;
import pageObjects.MyCourses;
import pageObjects.RegistrationPage;
import pageObjects.Success;

public class stepDefinition {
	
	public static WebDriver driver;
	private HomePage homePage;
	private RegistrationPage registrationPage;
	private MyCourses mycourses;
	//ComposeMail mail;
	
	@Before
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayasrp2\\Documents\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void aftertest() {
		driver.close();
	}
	
			
	@Given("I am able to launch the elearning application")
	public void i_am_able_to_launch_the_elearning_application() {
		driver.get("http://elearningm1.upskills.in/index.php");
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=' Sign up! ']")));
				//visibilityOfElementLocated(driver.findElement(By.xpath("//*[text()=' Sign up! ']"))));
	   }

	@When("I click on SignUp link")
	public void i_click_on_sign_up_link() {
		//HomePage homePage=new HomePage(driver);
		new HomePage(driver).clickOnSignup();
	}
	
	@When("I enter the firstname as {string}")
	public void i_enter_the_firstname_as(String string) {
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.enter_Firstname(string);
	}
	@When("I enter the lastname as {string}")
	public void i_enter_the_lastname_as(String string) {
		new RegistrationPage(driver).enter_lastname(string);
	}
	@When("I enter the email as {string}")
	public void i_enter_the_email_as(String string) {
		new RegistrationPage(driver).enter_email(string);
	}
	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		new RegistrationPage(driver).enter_username(string);
	}
	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
		new RegistrationPage(driver).enter_password(string);
	}
	@When("I confirmpassword as {string}")
	public void i_confirmpassword_as(String string) {
		new RegistrationPage(driver).enter_confirmpassword(string);
	}
	@When("I click on the Register button")
	public void i_click_on_the_register_button() {
		new RegistrationPage(driver).click_register();
	}
	@Then("I should see a confirmation message for registration success")
	public void i_should_see_a_confirmation_message_for_registration_success() {
	    Success success = new Success(driver);
		success.validate_registrationSuccess();
	}

	
	
	/* ######Login to the application using existing credentials */
	
	@Given("I am able to launch the application")
	public void i_am_able_to_launch_the_application() {
		driver.get("http://elearningm1.upskills.in/index.php");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
		HomePage homePage=new HomePage(driver);
		homePage.enter_loginusername(string);
	}
	@When("I enter password as <{string}>")
	public void i_enter_password_as(String string) {
		new HomePage(driver).enter_loginpassword(string);
	}
	@When("I click on Login button")
	public void i_click_on_login_button() throws InterruptedException {
		new HomePage(driver).clickOnLogin();
		Thread.sleep(5000);
	}
	@Then("I should successfully login and view course catalog")
	public void i_should_successfully_login_and_view_course_catalog() {
	    MyCourses mycourses=new MyCourses(driver);
		mycourses.validateLogin();
	    }

	
	//##############Compose Mail
	@When("I click on compose link")
	public void i_click_on_compose_link() throws InterruptedException {
	    new MyCourses(driver).clickOnComposeLink();
	}
	@When("I enter Send address as <{string}>")
	public void i_enter_send_address_as(String string) {
	    new MyCourses(driver).enter_sendmailaddress(string);
	}
	@When("I enter Subject as <{string}>")
	public void i_enter_subject_as(String string) {
	    new MyCourses(driver).enter_subject(string);
	}
	@When("I enter message body as <{string}>")
	public void i_enter_message_body_as(String string) {
	    new MyCourses(driver).enter_messagebody(string);
	}
	@When("I click on Send message button")
	public void i_click_on_send_message_button() {
	    new MyCourses(driver).clickOnSendMessage();
	}
	@Then("I should see a confirmation for message sent")
	public void i_should_see_a_confirmation_for_message_sent() {
	    new MyCourses(driver).validate_MessageSent();
	}
}

