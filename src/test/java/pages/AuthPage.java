package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage {

	protected WebDriver driver;

	private By txt_login = By.name("username");
	private By txt_password = By.name("password");

	private By btn_login = By.cssSelector("div#app button[type=\"submit\"]");
	private By btn_menu_logout = By.cssSelector("div#app div.oxd-topbar-header-userarea > ul > li > span");
	private By btn_logout = By.cssSelector("div#app li > ul > li:nth-child(4)");
	private By txt_verify = By.cssSelector("div#app h6");

	public AuthPage(WebDriver driver) {
		this.driver = driver;
		if (!driver.getTitle().equals("OrangeHRM")) {
			throw new IllegalStateException("This is not Login Page The current page is : " + driver.getTitle());
		}
	}

	public void enterlogin(String login) {
		driver.findElement(txt_login).sendKeys(login);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickBtnLogin() {
		driver.findElement(btn_login).click();
	}

	public void clickLogout() throws Exception {
		driver.findElement(btn_menu_logout).click();
		Thread.sleep(1000);
		driver.findElement(btn_logout).click();
	}

	public String verifyHead() {
		return driver.findElement(txt_verify).getText();
	}
}
