package runnerWeek2;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/featuresweek2/FeaturesMergeLead.feature",
monochrome=true,
glue={"HooksWeek2","LeadsWeek2"})

public class MergeLeadRunnerWeek2 extends AbstractTestNGCucumberTests{

}
