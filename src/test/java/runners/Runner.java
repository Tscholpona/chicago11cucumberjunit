package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber","json:target/report.json"},
        features = "src/test/resources/features",
        glue = "steps",
        tags="@wikipedia",
        dryRun = false
)
public class Runner {

    }

