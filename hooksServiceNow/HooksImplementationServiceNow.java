package hooksServiceNow;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import ServiceNowStepDefinition.BaseClassServiceNow;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImplementationServiceNow extends BaseClassServiceNow {
	@Before
	public void preConditions() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dev48946.service-now.com/navpage.do");
	}

@After
public void postConditions() {
	 driver.close(); 
}
}