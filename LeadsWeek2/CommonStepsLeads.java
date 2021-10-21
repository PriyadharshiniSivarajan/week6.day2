package LeadsWeek2;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepsLeads extends BaseClassLead {
	@And("Give the username {string}")
	public void getUserName(String uname) {

		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@And("Give the password {string}")
	public void getPassword(String pswd) {
		driver.findElement(By.id("password")).sendKeys(pswd);

	}
	@When("Click on the login button")
	public void clickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When("Click on {string} link")
	public void clickLink(String string) {
		driver.findElement(By.linkText(string)).click();

	}
	@When("Click on phone")
	public void clickPhNo() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}
	@When("Click on findLeads button")
	public void click_on_find_leads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("Click on submitButton link")
	public void click_on_submit_button_link() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("{string} page is displayed")
	public void checkTitle(String title) {
		String title1 = driver.getTitle(); 
		Assert.assertEquals(title1, title);
		System.out.println(title);
		/*
		 * String title1 = driver.getTitle(); if (title1.contains(title)) {
		 * System.out.println("Title verified"); } else {
		 * System.out.println("Not verified"); }
		 */

	}
}
