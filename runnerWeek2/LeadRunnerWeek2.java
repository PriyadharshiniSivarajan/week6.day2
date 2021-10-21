  package runnerWeek2;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/featuresweek2",
                 monochrome=true,
                 glue={"LeadsWeek2","HooksWeek2"},
                 tags= "@smoke and @sanity"
)

public class LeadRunnerWeek2 extends AbstractTestNGCucumberTests {
	
	
}
