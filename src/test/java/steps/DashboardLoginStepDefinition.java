package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class DashboardLoginStepDefinition extends TestBase{
	
	LoginPage loginPage;
	
	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String LoginData, String Field) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	    if(Field.equalsIgnoreCase("username")) {
	    	
	    	loginPage.enterUserName(LoginData);
	    }else if(Field.equalsIgnoreCase("password")) {
	    	
	    	loginPage.enterPassword(LoginData);
	    }else {
	    	System.out.println("Enter valid login data" + LoginData + "Field" + Field);
	    }
	}
	@When("User clicks on \"SignIn\"button")
	public void user_clicks_on_SignIn_button() {
		loginPage.clickSignInButton();
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		String expectedTitle = "Codefios";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("Page title are not matching!", expectedTitle, actualTitle);
	}

//	@After
//	public void afterRun() {
//		driver.close();
//		driver.quit();
//	}


}
