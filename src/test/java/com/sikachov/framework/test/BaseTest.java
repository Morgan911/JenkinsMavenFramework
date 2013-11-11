package com.sikachov.framework.test;

import static com.sikachov.framework.helpers.BaseHelper.log;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sikachov.framework.factories.WebDriverFactory;
public abstract class BaseTest {
	private static final String BASE_ADDRESS = "http://pn.com.ua/";
	protected WebDriver driver;


	@BeforeClass
	public void setUp() {
		driver = WebDriverFactory.getDriver(DesiredCapabilities.firefox());
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(BASE_ADDRESS);
	}
	
	public void goToMainPage(){
		log("open main page");
		driver.get(BASE_ADDRESS);
	}

	/*@AfterClass
	public void tearDown() {
		driver.quit();
	}*/
}
