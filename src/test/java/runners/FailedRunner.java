package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", // raporların konsolda çıkması için
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt"
        },
        monochrome = true, // raporların konsolda daha okunaklı şekilde çıkması için
        features = "@target/failed_scenarios.txt",  //txt dosya path
        glue = {"stepdefinitions","hooks"} ,
        dryRun = false
)
public class FailedRunner {
}
