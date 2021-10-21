package ServiceNowStepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonStepDefinition extends BaseClassServiceNow {

	String title;
	String text2;
	@Then("Switch to frame0")
	public void switch_to_frame0() throws InterruptedException {

		driver.switchTo().frame(0);
	}

	@Then("Give the username {string}")
	public void give_the_username(String name) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("user_name")).sendKeys(name);

	}

	@Then("Give the password {string}")
	public void give_the_password(String pswd) {
		driver.findElement(By.id("user_password")).sendKeys(pswd);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("sysverb_login")).click();
	}

	@Then("{string} page is displayed")
	public void page_is_displayed(String string) {
		title = driver.getTitle();
		Assert.assertEquals(title, string);
		System.out.println(title);
	}

	@Given("Give {string} in filter navigator")
	public void give_in_filter_navigator(String string) {
		driver.findElement(By.id("filter")).sendKeys(string, Keys.ENTER);

	}

	@When("Click on Incidents")
	public void click_on_incidents() {
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
	}

	@Given("Click on the incident number")
	public void click_on_the_incident_number() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	}

	@Given("Give the incident number {string}")
	public void give_the_incident_number(String string) {
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(string, Keys.ENTER);
	}

	@When("Click update button")
	public void click_update_button() {
		driver.findElement(By.id("sysverb_update")).click();
	}
	
	@Then("Check if status of {string} is {string}")

	public void Check_if_status(String xpath,String status) {
	WebElement priority = driver.findElement(By.xpath(xpath));
	text2 = priority.getText();
	if (text2.contains(status)) {
		System.out.println("Priority verified");
	} else {
		System.out.println("Not verified");
	}

}

}
