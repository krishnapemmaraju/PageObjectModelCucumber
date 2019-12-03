package com.pom.cucumber.TestRunner;

import java.io.IOException;

import com.cucumber.listener.Reporter;
import com.pom.cucumber.Utils.TestUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	 @Before
	    public void before(Scenario scenario)
	    {
	        System.out.println("running scenario: "+scenario.getName());
	    }

	    @After
	    public void after(Scenario scenario) throws IOException
	    {
	        scenario.write("Test string to output in reports.");
	        System.out.println("Finished running scenario: "+scenario.getName());
	        Reporter.addScreenCaptureFromPath(TestUtils.takeScreenShotWebPage(scenario.getName()));
	    }
	}


