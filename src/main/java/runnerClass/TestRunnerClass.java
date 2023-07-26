package runnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/kartik/Desktop/EclipseWorkspace/BBD_Free_CRM/src/main/java/Features/login.feature", //the path of the feature files
		glue="stepDefinition"//the path of the step definition files
		,plugin= {"pretty","html:test-outout.html", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}//to generate different types of reporting
		//,monochrome = true, //display the console output in a proper readable format
		//,dryRun = true//to check the mapping is proper between feature file and step definition file
		//,tags = "@SmokeTest and @RegressionTest or @End2End"			
  	  )
public class TestRunnerClass {
	


}
