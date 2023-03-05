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
                "junit:target/xml-report/cucumber.xml"
        },
        monochrome = true, // raporların konsolda daha okunaklı şekilde çıkması için
        features = "./src/test/resources/features",
        glue = {"stepdefinitions","hooks"} ,
        tags = "@excel_automation",
        dryRun = false
)
public class Runner {
}
