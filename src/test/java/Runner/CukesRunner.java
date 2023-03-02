package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/JSON_Reports/Cucumber.json",
        "junit:target/Cucumber_Reports/Cucumber.xml",
        "html:target/HTML_Reports/index.html"},
        monochrome = false,
        features = "src/test/resources/CucumberFeature/",
        glue = {"StepDef"},
        dryRun = false,
        tags="@Pet"
        )
public class CukesRunner {
}
//This is runner class which is execute the feature file