import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        features = {"src/test/java/Features/Login.feature"},
        plugin = {"pretty","html:target/report.html"},
        monochrome = true
        )

public class TestRunner
{

}
