package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\kalai\\src\\test\\resources\\cycloslogin.feature", glue="CyclosLogin")
public class Runner {

}
