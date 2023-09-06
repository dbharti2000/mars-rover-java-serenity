package nasa.mars.rover.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Sanity",
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "nasa.mars.rover.steps"
)

public class TestSuite {
}
