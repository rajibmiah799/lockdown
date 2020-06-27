package com.careerhack.testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	@CucumberOptions(
			features="Features",
			glue ="com.careerhack.stepdef",
			plugin= "pretty",
			tags="@userregister",
			monochrome= true
			)
			

	public class TestRunner extends AbstractTestNGCucumberTests{


	}

