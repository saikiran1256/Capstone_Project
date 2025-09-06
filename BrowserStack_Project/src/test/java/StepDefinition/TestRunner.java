package StepDefinition;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue={"StepDefinition"},
plugin= {"pretty","html:target/Html/htmlreport1.html","json:target/JSON/jsonreport1","junit:target/JUNIT/junitreport1"})
public class TestRunner {

}