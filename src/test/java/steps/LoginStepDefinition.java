package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	DatabasePage databasePage;
	@Before
	public void beforeRun() {

		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}

	@Given("User is on the codefios login page")
	public void user_is_on_the_codefios_login_page() {

		driver.get("https://codefios.com/ebilling/login");
		takeScreenshot (driver);
	}

	@When("User enters {string} from mysql database")
	public void user_enters_from_mysql_database(String loginDataFromDb) {
	   switch(loginDataFromDb) {
	   case "username":
		   loginPage.enterUserName(databasePage.getDataFromDb("user_name"));
		   System.out.println("Username from DB:" + databasePage.getDataFromDb("user_name"));
		   break;
	   case "password":
		   
		   loginPage.enterPassword(databasePage.getDataFromDb("user_password"));
		   System.out.println("Password from DB:" + databasePage.getDataFromDb("user_password"));
		   break;
		   default:
			   System.out.println("Unable to retreive login data" + loginDataFromDb);
	   
	   }
	}
	@When("User enters username as {string}")

	public void userEntersUsernameAs(String username) {

		loginPage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("User clicks on signin button")
	public void user_clicks_on_signin_button() {
		loginPage.clickSignInButton();
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTitle = "Codefios";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("Page title ate not matching!", expectedTitle, actualTitle);

	}

	
	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}
}
