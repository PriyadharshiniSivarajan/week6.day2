package ServiceNowStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignIncidnetStepDefinition extends BaseClassServiceNow {

	/*
	 * @Given("Give the incident number {string}") public void
	 * give_the_incident_number(String string) {
	 * driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(
	 * string, Keys.ENTER);
	 * 
	 * }
	 */

	/*
	 * @Given("Click on the incident number") public void
	 * click_on_the_incident_number() throws InterruptedException {
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("//a[@class='linked formlink']")).click(); }
	 */

	@When("Click on Assignment group search button")
	public void click_on_assignment_group_search_button() {
		driver.findElement(By.id("lookup.incident.assignment_group")).click();
	}

	@When("Click on next page arrow")
	public void click_on_next_page_arrow() {
		driver.findElement(By.xpath("(//button[@name='vcr_next'])[1]")).click();
	}

	@When("Click on software")
	public void click_on_software() {
		driver.findElement(By.xpath("//a[text()='Software']")).click();
	}

	@Given("Update the work notes {string}")
	public void update_the_work_notes(String string) {
		driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']")).sendKeys(string);
	}
	/*
	 * @When("Click update button") public void click_update_button() {
	 * driver.findElement(By.id("sysverb_update")).click(); }
	 */

}
