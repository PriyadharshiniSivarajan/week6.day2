package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@BeforeTest
	public void setFileName() {
		excelFileName = "CreateLead";

	}

	@Test(dataProvider="fetchData")
	public void getCreateLead(String cmpnyName, String name, String secName, String number) throws IOException {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpnyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(secName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(number);
		driver.findElement(By.name("submitButton")).click();

	}

}
