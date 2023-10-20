package pageFactory;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Factory {

	@FindBy(how = How.NAME, using = "username")
	WebElement login_txt;

	@FindBy(name = "password")
	WebElement password_txt;

	@FindBy(how = How.CSS, using = "div#app button[type=\"submit\"]")
	// @FindBy(xpath = "//button[normalize-space()=\"Login\"]")
	WebElement btnConnetion;

	@FindBy(xpath = "//span[@class=\"oxd-topbar-header-breadcrumb\"]")
	WebElement verifyHeader;

	WebDriver webDriver;

	public LoginPage_Factory(WebDriver driver) {
		this.webDriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterLogin(String username) {
		login_txt.sendKeys(username);
	}

	public void enterPassword(String password) {
		password_txt.sendKeys(password);
	}

	public void clickBottonLogin() {
		btnConnetion.click();
	}

	public void checkHeader() {
		assertTrue(verifyHeader.getText().contains("Dashboard"));
	}

}
