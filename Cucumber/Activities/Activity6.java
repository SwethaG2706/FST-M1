package testRunner;

	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "C:\\Users\\SWETHAGADDAM\\eclipse-workspace\\FST_Cucumber\\src\\test\\java\\features",
	    glue = {"stepDefinitions"},
	    tags = "@SmokeTest",
	    plugin = {"pretty"},
	    monochrome = true
	)

	public class ActivitiesRunner {
	    //empty
	}