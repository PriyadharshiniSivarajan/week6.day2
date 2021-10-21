package LeadsWeek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadStepDefinitionWeek2 extends BaseClassLead{


	@Given ("Enter the username {string}")
	public void getUserName(String userid) {
		driver.findElement(By.id("username")).sendKeys(userid);
	}

	@And("Enter the password {string}")
	public void getPassword(String pswd) {

		driver.findElement(By.id("password")).sendKeys(pswd);
	}

	@When("click on login button")
	public void clickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();
	}

	
	/*
	 * @When("Click on phone") public void clickPhNo() {
	 * driver.findElement(By.xpath("//span[text()='Phone']")).click();
	 * 
	 * }
	 */
	@Given("enter the phno {string}")
	public void getPhno(String phno) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
	}
	@When("click on findleads")
	public void clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	@When("click on firstLeadid")
	public void clickLeadId() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}


	@When("click on editbutton")
	public void clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
}


	@Given("Add value to cmpname {string}")
	public void editCompName(String cmpname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cmpname);
	}
	@When("click on submitbutton")
	public void clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	
}