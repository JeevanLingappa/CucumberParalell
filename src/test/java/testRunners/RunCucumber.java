package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations",
		tags= {"@CheckBox or @RadioButton"}
		//tags= {"@MultiCheckBox or @Parallel"}
		)
public class RunCucumber {

}
