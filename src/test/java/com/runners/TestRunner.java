package test.java.com.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/falabella/features"},
        glue = {"steps"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "json:build/cucumber-reports/cucumber.json",
                "rerun:build/cucumber-reports/rerun.txt"
        })
public class TestRunner {


}
