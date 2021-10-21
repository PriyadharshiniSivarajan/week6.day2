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

public class CreateLeadStepDefinitionWeek2 extends BaseClassLead{


	@Given("Give the company {string}")
	public void getComName(String cmpname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpname);

	}
	@And("Give the first name {string}")
	public void getFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

	}
	@And("Give the last name {string}")
	public void getLastName(String lname) {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@And("Give the phone no {string}")
	public void getPhNo(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);

	}
	@When("Click on the submit button")
	public void clickSubmit() {
		driver.findElement(By.name("submitButton")).click();	
	}
	
	}
	
