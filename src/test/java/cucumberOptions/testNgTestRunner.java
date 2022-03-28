package cucumberOptions;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/features/login.feature",
                glue = "stepDefinations")

public class testNgTestRunner extends AbstractTestNGCucumberTests {
}
