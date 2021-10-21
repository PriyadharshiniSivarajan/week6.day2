package ServiceNowStepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteIncidentStepDefinition extends BaseClassServiceNow{
	String text ;
	@When("Click on delete button")
	public void click_on_delete_button() {
		driver.findElement(By.xpath("(//button[text()='Delete'])[1]")).click();
	}
	@Then("Click ok button")
	public void click_ok_button() {
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
	}

	@Then("Check for records of incident")
	public void check_for_records_of_incident() {
		 text = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();
		if(text.contains("No record"))
		{
			System.out.println("Incident deleted");
		}
		else
		{
			System.out.println("Incident not deleted");
		}
	}
}
