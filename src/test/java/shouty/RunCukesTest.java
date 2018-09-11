package shouty;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\shouty\\"},
snippets = SnippetType.CAMELCASE,
        tags = "@positive and @negative"

)
public class RunCukesTest {
}
