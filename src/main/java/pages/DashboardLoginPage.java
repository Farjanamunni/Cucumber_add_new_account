package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardLoginPage {
	WebDriver driver;

	public DashboardLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	WebElement SignInButton;
	
	@FindBy(how = How.XPATH, using = "//span[text()='List Accounts']")
	WebElement ListAccounts;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Add Account']")
	WebElement AddAccount;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_name\"]")
	WebElement AccountName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH,using = "//input[@id='contact_person']")
	WebElement ContactPerson;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"accountSave\"]")
	WebElement SaveButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/header/nav/div[2]/ul[1]/li[2]/a")
	WebElement ValidateAccount;
	
	private WebElement DashboardStepDefinition;

	
	public void clickSignInButton() {
		SignInButton.click();
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	public void clickListAccounts() {
		ListAccounts.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickAddAccount() {
		AddAccount.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterAccountName(String accountName) {
		AccountName.sendKeys(accountName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	public void enterDescription(String description) {
		Description.sendKeys(description);
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void enterInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	public void enterContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	public void clickSave() {
		SaveButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}

	
	
}
