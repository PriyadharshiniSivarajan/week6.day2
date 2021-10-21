package runnerWeek2;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/featuresweek2/FeaturesEditLead.feature",
monochrome=true,
glue={"HooksWeek2","LeadsWeek2"})

public class EditLeadRunnerWeek2 extends AbstractTestNGCucumberTests {

}
