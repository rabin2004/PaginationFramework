package step_defination;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\User\\Desktop\\Transfotech\\Setup files for Selenium Java\\CucumberPaginationframework1-master\\CucumberPaginationframework1-master\\src\\test\\resources\\features",
		plugin = {"pretty", "html:target/cucumber-html-report", "json:json_output/cucumber.json", "junit:junit_output/cucumber.junit"},
		monochrome = true,
		glue="step_defination",
		tags = {}
		)
public class TestRunner{
	
}
