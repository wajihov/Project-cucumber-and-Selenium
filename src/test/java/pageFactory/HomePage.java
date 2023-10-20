package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//li[@class=\"oxd-userdropdown\"]")
	WebElement btn_menu_logout;

	@FindBy(xpath = "//header[@class=\"oxd-topbar\"]//li[4]")
	WebElement btn_logout;

	WebDriver webDriver;

	public HomePage(WebDriver driver) {
		this.webDriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void disconnect() throws Exception {
		btn_menu_logout.click();
		Thread.sleep(1000);
		btn_logout.click();
	}
}
