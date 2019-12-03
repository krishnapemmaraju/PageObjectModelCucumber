package com.pom.cucumber.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pom.cucumber.Utils.TestUtils;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	TestUtils testUtils;
	
	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\pom\\cucumber\\config\\config.properties");
			prop.load(fis);
			prop.getProperty("userName");
		}catch(Exception e) {
			System.out.println("The Cause of the Error is " + e.getCause());
			System.out.println("The Error Message is " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void initialization() throws IOException  {
		
		if ( prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\KrishnaData\\Selenium\\chromedriver_win3277V\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIME_OUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_PAGE_TIME_OUT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		if ( prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\KrishnaData\\Selenium\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIME_OUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_PAGE_TIME_OUT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		if ( prop.getProperty("browser").equals("Edge")) {
			System.setProperty("webdriver.gecko.driver","C:\\KrishnaData\\Selenium\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIME_OUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_PAGE_TIME_OUT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}
	

}
