package week6.day2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	public ChromeDriver driver;
	public String excelFileName;

	@DataProvider(name="fetchData",indices=1)
	public String[][] getData() throws IOException {
		ExcelSheet obj = new ExcelSheet();

		return obj.excelSheet(excelFileName);

	}

	@Parameters({ "url", "username", "pswd" })
	@BeforeMethod
	public void beforeMethod(String url, String name, String pswd) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pswd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
