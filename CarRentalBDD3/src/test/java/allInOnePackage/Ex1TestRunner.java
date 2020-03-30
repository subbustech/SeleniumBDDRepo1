package allInOnePackage;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//the path of the feature files
				features = "src\\test\\java\\allInOnePackage\\ex1login.feature",
				//the path of the step definition files
				glue={"allInOnePackage"}
		)

public class Ex1TestRunner {

}
