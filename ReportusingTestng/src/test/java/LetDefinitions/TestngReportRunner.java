package LetDefinitions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features="src\\test\\resources\\Features",
			glue={"LetDefinitions"},
			plugin={"pretty","testing.target/testNG-report/testing.html"},
			monochrome= true
			)


public class TestngReportRunner extends TestngReportSteps{
	

}
