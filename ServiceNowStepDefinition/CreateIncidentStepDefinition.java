package ServiceNowStepDefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;;

public class CreateIncidentStepDefinition extends BaseClassServiceNow {
	Set<String> handles;
	List<String> newHandles;
	
	String text;


	@When("Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

	}

	@Given("Get the window handles")
	public void get_the_window_handles() {
		handles = driver.getWindowHandles();
		newHandles = new ArrayList<String>(handles);
	}

	@When("Switch to window1")
	public void switch_to_window1() {
		driver.switchTo().window(newHandles.get(1));

	}

	@When("Click on search in caller")
	public void click_on_search_in_caller() {
		driver.findElement(By.id("lookup.incident.caller_id")).click();

	}

	@When("Click on the name that appears first")
	public void click_on_the_name_that_appears_first() {
		driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();

	}

	@Then("Switch to window0")
	public void switch_to_window0() {
		driver.switchTo().window(newHandles.get(0));

	}

	@Given("Give the shortdescription {string}")
	public void give_the_shortdescription(String name) {
		driver.findElement(By.id("incident.short_description")).sendKeys(name);

	}

	@When("Click on Submit button")
	public void clickSubmit() {
		driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();

	}

	@Given("Get the value of Incident number")
	public void get_the_value_of_incident_number() {
		text = driver.findElement(By.id("incident.number")).getAttribute("value");

	}

	@Then("Print the incident number")
	public void print_the_incident_number() {
		System.out.println("The incident number is" + text);

	}

	@When("Search incident number")
	public void search_Incident_Number() {
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(text, Keys.ENTER);

	}

	@Then("switch to default content")
	public void default_content() {
		driver.switchTo().defaultContent();

	}
	

	@Then("Get the screenshot")
	public void get_the_screenshot() throws IOException {
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("screenshotAs.png");
		FileUtils.copyFile(src1, dst);
	}

}
