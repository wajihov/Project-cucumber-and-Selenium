package steps;

public class AuthentificationPOM {

	/*WebDriver webDriver = null;
	AuthPage authPage;

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
		System.out.println("Inside step - user in on login page");
		webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		webDriver.manage().window().maximize();
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_email_and_password(String email, String password) throws Exception {
		System.out.println("===================== I am inside Authetification POM =====================");
		System.out.println("Inside step - user enters email and password");

		authPage = new AuthPage(webDriver);
		authPage.enterlogin(email);
		authPage.enterPassword(password);
		Thread.sleep(2000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		System.out.println("Inside Step - user clicks on login");
		authPage.clickBtnLogin();
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() throws Exception {
		System.out.println("Inside step - user navigated to the home page");
		assertTrue(authPage.verifyHead().contains("Dashboard"));
		authPage.clickLogout();
		Thread.sleep(2000);
		webDriver.close();
		webDriver.quit();
	}*/

}
