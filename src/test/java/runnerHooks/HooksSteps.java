package runnerHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {

	WebDriver driver = null;

	@Before(value = "@smoke", order = 1)
	@SuppressWarnings("deprecation")
	public void browserSetup() {
		// System.setProperty("", "");
		System.out.println("============== I am inside browserSetup III ================");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Before(order = 0)
	public void step2() {
		System.out.println("=-*-*-*-*-*-=> i 'm in the second steps in @Before");
	}

	@After(order = 1)
	public void teardown() {
		System.out.println("============== I am inside teardown 1 / 1 / 1  ================");
		driver.close();
		driver.quit();
	}

	@After(order = 2)
	public void tearown2() {
		System.out.println("/*-/*-/*-+ => i am in the Afetr 2");
	}

	@BeforeStep
	public static void beforeSteps() {
		System.out.println(" **************** I am inside to beforeStepsBeforeStep  *****************");
	}

	@AfterStep
	public static void teardownSteps() {
		System.out.println("---------------- I am inside to teardownStepsAfterStep ---------------- ");
	}

	@Given("user is in login page")
	public void user_is_in_login_page() {

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

	}

	@And("clicks on login botton")
	public void clicks_on_login_botton() {

	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {

	}

}
