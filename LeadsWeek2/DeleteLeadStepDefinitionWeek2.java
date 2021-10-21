package LeadsWeek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadStepDefinitionWeek2 extends BaseClassLead {
	
	String leadID;

	

	@Given("Give the phone number {string}")
	public void give_the_phone_number(String string) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(string);

	}
	
	@When("Click on delete button")
	public void click_on_delete_button() {
		driver.findElement(By.linkText("Delete")).click();
	}

	
	@Given("Give input id")
	public void give_input_id() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@When("Click on find button")
	public void click_on_find_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Get the first leadId")
	public void get_the_first_lead_id() throws InterruptedException {
		Thread.sleep(2000);
		 leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		 System.out.println(leadID);
	}
	@When("Click the first leadid")
	public void click_the_first_leadid() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Then("Get the record value")
	public void get_the_records() throws InterruptedException {
		Thread.sleep(2000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.contains("No records")) {
			System.out.println("Text matched");
		} 
		else {
			System.out.println("Text not matched");
		}
	}

}
