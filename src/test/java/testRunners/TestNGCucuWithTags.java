package testRunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations",
		tags= {"@RadioButton"},
		plugin= {"pretty","timeline:target/Timeline"
				,"html:target/HTMLReport"
				,"json:target/jsonRport/report1.json"
				,"junit:target/jUnitReport/JReport.xml"},
		monochrome=true
		)
public class TestNGCucuWithTags extends AbstractTestNGCucumberTests {
	

}
