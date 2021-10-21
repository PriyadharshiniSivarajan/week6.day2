package ServiceNowStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateIncidentStepDefinition extends BaseClassServiceNow{
	@When("Select dropdown urgency as high")
	public void select_dropdown_urgency_as_high() {
		WebElement urgency = driver.findElement(By.id("incident.urgency"));
		Select drop = new Select(urgency);
		drop.selectByValue("1");	
	}
	@When("Select dropdown state as inprogress")
	public void select_dropdown_state_as_inprogress() {
		WebElement state = driver.findElement(By.id("incident.state"));
		Select drop1 = new Select(state);
		drop1.selectByValue("2");
	}
	
}
