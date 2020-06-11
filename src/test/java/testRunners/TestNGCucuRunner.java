package testRunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations",
		tags= {"@CheckBox or @RadioButton"},
		plugin= {"pretty","timeline:target/Timeline","html:target/HTMLReport","json:target/jsonRport/report.json"},
		monochrome=true
		)
public class TestNGCucuRunner extends AbstractTestNGCucumberTests {
	
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }

}
