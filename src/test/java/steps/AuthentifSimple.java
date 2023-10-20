package steps;

public class AuthentifSimple {

	/*WebDriver webDriver = null;

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
		System.out.println("Inside step - user enters email and password");
		webDriver.findElement(By.name("username")).sendKeys(email);
		webDriver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		System.out.println("Inside Step - user clicks on login");
		webDriver.findElement(By.cssSelector("div#app button[type=\"submit\"]")).click();
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() throws Exception {
		System.out.println("Inside step - user navigated to the home page");
		WebElement dasboardTxt = webDriver.findElement(By.cssSelector("div#app h6"));
		// WebElement invalidCredentialsTxt = webDriver
		// .findElement(By.cssSelector("div#app
		// div.oxd-alert-content.oxd-alert-content--error > p"));
		if (dasboardTxt.getText().contains("Dashboard")) {
			assertTrue(dasboardTxt.getText().contains("Dashboard"));
		}
		/*
		 * if (invalidCredentialsTxt.getText().contains("Invalid credentials")) {
		 * assertTrue(invalidCredentialsTxt.getText().contains("Invalid credentials"));
		 * }
		 */

		/*Thread.sleep(2000);
		webDriver.close();
		webDriver.quit();
	}*/

}
