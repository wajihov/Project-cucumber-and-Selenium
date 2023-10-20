package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LoginPage_Factory;

public class AuthentificationPageFactory {

	WebDriver webDriver = null;
	LoginPage_Factory loginPage_Factory;
	HomePage homePage;

	@SuppressWarnings("deprecation")
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - Browser is open");
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("user in on login page")
	public void user_in_on_login_page() {
		System.out.println("=============== Page Factory ==============");
		System.out.println("Inside step - user in on login page");
		webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		webDriver.manage().window().maximize();
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_email_and_password(String email, String password) throws Exception {
		System.out.println("Inside step - user enters email and password");
		loginPage_Factory = new LoginPage_Factory(webDriver);
		loginPage_Factory.enterLogin(email);
		loginPage_Factory.enterPassword(password);
		Thread.sleep(2000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		System.out.println("Inside Step - user clicks on login");
		loginPage_Factory.clickBottonLogin();
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() throws Exception {
		System.out.println("Inside step - user navigated to the home page");
		loginPage_Factory.checkHeader();
		homePage = new HomePage(webDriver);
		homePage.disconnect();
		Thread.sleep(2000);
		webDriver.close();
		webDriver.quit();
	}

}
