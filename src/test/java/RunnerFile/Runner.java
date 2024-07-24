package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/", 
		glue={"com.Stepdefinition"},
		plugin={"pretty", "html:target/cucumber-Report.html", "json:target/report.json"}
		)
public class Runner {

}
