package HooksWeek2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import LeadsWeek2.BaseClassLead;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImplementationWeek2 extends BaseClassLead{
@Before
public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
@After
public void postConditions() {
	driver.close();

}

}

