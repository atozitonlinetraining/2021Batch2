package testrunner;
import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@Cucumber.Options(features = "*.feature"
,glue="StepDefinitions"
,tags = "@fileupload"
,dryRun = false
,format={"pretty", "html:reports/test-report"}
)
@RunWith(Cucumber.class)
public class Runner {
}
