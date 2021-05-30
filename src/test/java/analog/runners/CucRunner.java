package analog.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "analog/step/definitions",
        dryRun =false,
        tags = "@message",
        publish = true
)
public class CucRunner {
}
