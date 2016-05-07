package stephenfoxDemo;

import cucumber.api.junit.*;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"src/test/resources"}
       // , format = {"pretty", "html:target/results", "json:target/cucumber.json" }
        , format = {"progress"}
)
// @CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
public class CukesRunner {}