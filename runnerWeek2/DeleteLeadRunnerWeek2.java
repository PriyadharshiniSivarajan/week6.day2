package runnerWeek2;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/featuresweek2/FeaturesDeleteLead.feature",
monochrome=true,
glue= {"LeadsWeek2","HooksWeek2"})
public class DeleteLeadRunnerWeek2 extends AbstractTestNGCucumberTests{

}
