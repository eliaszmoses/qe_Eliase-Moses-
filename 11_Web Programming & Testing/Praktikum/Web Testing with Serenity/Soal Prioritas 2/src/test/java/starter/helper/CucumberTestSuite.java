package starter.helper;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-reports/report.html"},
        features = "src/test/resources/features/"
)
public class CucumberTestSuite {}
