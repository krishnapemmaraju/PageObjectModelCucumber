package com.pom.cucumber.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

import java.io.File;
import java.io.IOException;
import java.util.TimeZone;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.pom.cucumber.Utils.TestUtils;
import com.pom.cucumber.base.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(
        
		features = "C:\\Users\\kpemmaraju\\eclipse-workspace\\PageObjectModelUsingCucumber\\src\\main\\java\\com\\pom\\cucumber\\feature\\AutomationAddrBookAddNewAddr.feature",
		glue={"com\\pom\\cucumber\\stepdefinitions"},
		format  = {"pretty","html:test-output" , "json:jspn-output/CucumberJsonReport.json"},
		strict=true,
		monochrome=true,
		dryRun=false,
		plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/test-output/report_modified.html"}
		)

public class TestRunner extends BaseClass {
	
	/*@Before
	public static void writeExtentReport() throws IOException 
	{
		TimeZone timeZone = TimeZone.getTimeZone("Europe/Copenhagen");
		Reporter.setSystemInfo("User Name", "KrishnaKiran");
		Reporter.setSystemInfo("Platform", "Windows");
		Reporter.loadXMLConfig(new File(prop.getProperty("reportConfigPath")));
	}*/
		@After("@test")
		public void testdata(Scenario scenario) throws IOException {
			if ( scenario.isFailed()) {		
				Reporter.addScreenCaptureFromPath(TestUtils.takeScreenShotWebPage(scenario.getName()), "Please find the below screenhot for"+scenario.getName());
		   }
		}
		
	}


