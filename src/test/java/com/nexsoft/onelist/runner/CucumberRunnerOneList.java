package com.nexsoft.onelist.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",
				 features = "src/test/resources/OneList.feature",
				 glue = "com.nexsoft.onelist.definitions")
public class CucumberRunnerOneList extends AbstractTestNGCucumberTests{
}
