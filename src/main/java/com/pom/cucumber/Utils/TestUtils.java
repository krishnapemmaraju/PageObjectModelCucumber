package com.pom.cucumber.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.pom.cucumber.base.BaseClass;

import cucumber.api.java.it.Date;

public class TestUtils extends BaseClass {
	
	public static java.util.Date dt = new java.util.Date();
	
	public static int PAGE_LOAD_TIME_OUT = 40;
	public static int IMPLICIT_PAGE_TIME_OUT = 40;
	
	public static void SelectData(WebElement element,String optionType,String dataToSelect) {
		Select selByData = new Select(element);
		if (optionType.equals("value")) {
			selByData.selectByValue(dataToSelect);
		}if (optionType.equals("text")) {
			selByData.selectByVisibleText(dataToSelect);
		}if(optionType.equals("index")) {
			selByData.selectByIndex(Integer.parseInt(dataToSelect));
		}
	}
	
	public static String takeScreenShotWebPage(String screenshotName) throws IOException {
		
		SimpleDateFormat dtformat = new SimpleDateFormat("DDMMYYYYHHMMSS");
		String ScreenshotDate = dtformat.format(dt);
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		String destination = System.getProperty("user.dir")+ "\\test-output\\"+screenshotName+"_"+ScreenshotDate+".png";
		File src = takeScreenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(destination);
		FileHandler.copy(src, dest);
		return destination;
	}

}
