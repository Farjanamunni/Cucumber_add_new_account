package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pages.DashboardLoginPage;
import pages.LoginPage;
import pages.TestBase;

public class AddNewAccountStepDefinition extends TestBase{
	DashboardLoginPage dashboardLoginPage;
	
	@And("User clicks on {string}")
	public void user_clicks_on_button(String button) {
		dashboardLoginPage = PageFactory.initElements(driver, DashboardLoginPage.class);
	    if(button.equalsIgnoreCase("listAccount")) {
	    	dashboardLoginPage.clickListAccounts();
	    }
	    
	else if(button.equalsIgnoreCase("addAccount")) {
		dashboardLoginPage.clickAddAccount();
	    	
	    }
	else if(button.equalsIgnoreCase("Save")) {
		dashboardLoginPage.clickSave();
	    
	    }else if (button.equalsIgnoreCase("signin")) {
	    	dashboardLoginPage.clickSignInButton();
	    }
	
	else {
	    	System.out.println("Give me valid information"  );
	    }
	
	
	
	}


	@Then("User enters {string} in the {string} field in accounts page")
	    public void user_enters_in_the_field_in_accounts_page(String loginData, String field ) {
	        
	    
	    switch (field) {
	    
	    case "accountName":
	    	dashboardLoginPage.enterAccountName(loginData);
			   break;

	    case "description":
	    	dashboardLoginPage.enterDescription(loginData);
			   break;
	    case "initialBalance":
	    	dashboardLoginPage.enterInitialBalance(loginData);
			   break;
			   
	    case "accountNumber":
	    	dashboardLoginPage.enterAccountNumber(loginData);
			   break;
	    case "contactPerson":
	    	dashboardLoginPage.enterContactPerson(loginData);
			   break;
			   
	     
	    
	 default:
		   System.out.println("Unable to retrive login data");
	    }
	}

	

	@Then("User should be able to validate account created successfully")
	    	public void user_should_be_able_to_validate_account_created_successfully() {
	    	   
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		takeScreenshot(driver);
//		String expectedTitle = "Codifies";
//		String actualTitle = dashboardLoginPage.getPageTitle();
//		Assert.assertEquals("Page title ate not matching!", expectedTitle, actualTitle);

	}

}
