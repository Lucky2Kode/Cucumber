import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"src/test/resources/features"},
        glue= {"com.example.definitions"},
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
        monochrome = true
)
public class CucumberRunnerTest {

}