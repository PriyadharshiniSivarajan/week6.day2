package ServiceNowRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/servicenow",
monochrome=true,
glue={"ServiceNowStepDefinition","hooksServiceNow"},
tags="@smoke and @smoke"
)
public class CreateIncidentRunner extends AbstractTestNGCucumberTests{
	
}
